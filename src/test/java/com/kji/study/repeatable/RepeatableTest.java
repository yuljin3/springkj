package com.kji.study.repeatable;

import static org.junit.Assert.*;

import java.lang.annotation.Repeatable;

import org.junit.Test;

@Repeatable(Annas.class)
@interface Anna{ String value(); }

@interface Annas {
	Anna[] value();
}


/**
 * 
 * java 1.7 버전 까지는 동일한 annotation 을 복수로 달아주기 위해서 배열을 사용해야 했다.
 * java 1.8 버전 부터는 동일한 annotation 을 복수로 달아주기 위해 해당 annotation에 @Repeatable 을 달아주면 된다.
 * RepeatableTest2 클래스와 비교 
 * 
 * @author kj
 *
 */
@Annas({@Anna("China"), @Anna("Korea")})
public class RepeatableTest {

	@Test
	public void testName() throws Exception {
		Annas classes = Repeatable.class.getAnnotation(Annas.class);
	}

}
