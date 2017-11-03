package com.kji.study.time.format;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class DateTimeFormatChecker {

	
	String[] formats = {
		"yyyy-MM-dd'T'HH:mm:ss'Z'",
		"yyyy-MM-dd'T'HH:mm:ssZ",
		"yyyy-MM-dd'T'HH:mm:ss",
		"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
		"yyyy-MM-dd'T'HH:mm:ss.SSSZ",
		"yyyy-MM-dd HH:mm:ss",
		"MM/dd/yyyy HH:mm:ss",
		"MM/dd/yyyy'T'HH:mm:ss.SSS'Z'",
		"MM/dd/yyyy'T'HH:mm:ss.SSSZ",
		"MM/dd/yyyy'T'HH:mm:ss.SSS",
		"MM/dd/yyyy'T'HH:mm:ssZ",
		"MM/dd/yyyy'T'HH:mm:ss",
		"yyyy:MM:dd HH:mm:ss",
		"yyyyMMdd"};

	@Test
	public void testParseStringToDate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println(sdf.format(new Date()));

	}

	@Test
	public void testParseStringToDate2() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date1 = sdf.parse("2013-09-29T18:46:19+0900");

		Date date2 = sdf.parse("2013-09-29T18:46:19+0700");

		System.out.println(date1);
		System.out.println(date2);

	}

	@Test
	public void testParseFormat() throws Exception {
		String yyyyMMdd = "2017-02-01T00:00:00.000+0900";
		parse(yyyyMMdd);
	}

	private void parse(String d) {
		if (d != null) {
			for (String parse : formats) {
				SimpleDateFormat sdf = new SimpleDateFormat(parse);
				Date date;
				try {
					date = sdf.parse(d);
					System.out.println("Printing the value of " + parse);
					System.out.println(date);
				} catch (ParseException e) {
				}

			}
		}
	}

	private static final String JSON_FILE_PATH_PROJECT_PRODUCT_LIST = "src/test/resources/json/data.json";
	@Test
	public void testName() throws Exception {
		File file = new File(JSON_FILE_PATH_PROJECT_PRODUCT_LIST);
		ObjectMapper objectMapper  = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
		objectMapper.readValue(file, IaasAuditBean.class);
	}
}
