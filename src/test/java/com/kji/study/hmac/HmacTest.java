package com.kji.study.hmac;

import static org.junit.Assert.*;

import java.security.SignatureException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class HmacTest {

	private final static String HMAC_SHA1_ALGORITHM = "HmacSHA1";

	public String calculateRFC2104HMAC(String data, String key) throws java.security.SignatureException {
		String result;
		try {
			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes("UTF-8"), HMAC_SHA1_ALGORITHM);
			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);
			byte[] rawHmac = mac.doFinal(data.getBytes());
			result = Base64.encodeBase64String(rawHmac);
		} catch (Exception e) {
			throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
		}
		return result;
	}

	@Test
	public void testName() throws Exception {
		String key = "axexdedd";
		String data = calculateRFC2104HMAC("가나다라마바사아아아아앙아아아아아아아아앙123!@#$%#^&*", key);
		System.out.println(data);
	}

}
