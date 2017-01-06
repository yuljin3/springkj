package com.kji.study.mybatis.origin;

import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;

public class MybatisOriginTest {

	@Test
	public void testReadResource_xml() throws Exception {
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	//TODO java로 mapper 매핑하기 
	@Test
	public void testReadResource_java() throws Exception {

		DataSource dataSource = new PooledDataSource("cubrid.jdbc.driver.CUBRIDDriver", "jdbc:cubrid:10.161.142.69:30102:toast_mail:::?charset=UTF-8", "toast_mail", "toast_mail!@#123");

		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);

		Configuration configuration = new Configuration(environment);
		configuration.addMapper(ReceiverMapper.class);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

		SqlSession session = sqlSessionFactory.openSession();

		ReceiverMapper mapper = session.getMapper(ReceiverMapper.class);

		Receiver receiver = mapper.selectDetailReceives("201612091217531441");

		System.out.println(receiver);
		session.close();

	}

	@Test
	public void testExecuteQuery() throws Exception {

		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();

		Receiver receiver = session.selectOne("com.kji.study.mybatis.origin.ReceiverMapper.selectDetailReceives", "201612091217531441");

		System.out.println(receiver);
		session.close();

	}

	@Test
	public void testExecuteQuery_getMapper() throws Exception {

		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();

		ReceiverMapper mapper = session.getMapper(ReceiverMapper.class);

		Receiver receiver = mapper.selectDetailReceives("201612091217531441");

		System.out.println(receiver);
		session.close();

	}

	/**
	 * 1. <mapper class="com.kji.study.mybatis.origin.ReceiverJavaMapper"/>
	 * mybatis config에서 mappert에 interface 를 직접 맵퍼로 등록해서 사용 할 수 있다. 
	 * 2. <package name="com.kji.study.mybatis.origin"/>
	 * packag를 등록해서 해당 패키지의 interface를 자동등록해서 사용한다. 
	 */
	@Test
	public void testExecuteQuery_getMapper_java() throws Exception {

		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();

		ReceiverJavaMapper mapper = session.getMapper(ReceiverJavaMapper.class);

		Receiver receiver = mapper.selectDetailReceives("201612091217531441");

		System.out.println(receiver);
		session.close();

	}

	/**
	 * Properties 파일 읽어서 mybatis-config 파일 ${value}로 설정
	 */
	@Test
	public void testExecuteQuery_read_config() throws Exception {

		String resource = "mybatis/mybatis-config_nonconfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		String confiResource = "mybatis/jdbc.properties";
		InputStream config = Resources.getResourceAsStream(confiResource);

		Properties properties = new Properties();
		properties.load(config);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, properties);

		SqlSession session = sqlSessionFactory.openSession();
		ReceiverMapper mapper = session.getMapper(ReceiverMapper.class);
		Receiver receiver = mapper.selectDetailReceives("201612091217531441");

		System.out.println(receiver);
		session.close();

	}

	/**
	 * 1. ExampleTypeHandler 에서 receiverMailAddr가로 채서값 변경하기 테스트 
	 * 
	 * 2. ExamplePlugin 에 query , update 등 쿼리 수행에 대해 intercept를 할 수 있다. 
	 * 	  console결과확인 ! 
	 */
	@Test
	public void testExecuteQuery_custom_handlerType() throws Exception {

		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		ReceiverMapper mapper = session.getMapper(ReceiverMapper.class);

		Receiver receiver = mapper.selectDetailReceiveHandler("201612091217531441");

		String originReceiverMaillAddr = "khpMHFtG0QFbLWNDe-soZhYgvyBs5rpp3mObSf3m7AE";

		assertTrue((originReceiverMaillAddr + "_typeHandler").equals(receiver.getReceiveMailAddr()));

		System.out.println(receiver);

		session.close();

	}

	/**
	 * 1. 생성자를 통해 값을 변경해서 넣는 경우라면 resultMap에 constructor를 사용하면 된다. 
	 */
	@Test
	public void testExecuteQuery_resultMap_constructor() throws Exception {

		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		ReceiverMapper mapper = session.getMapper(ReceiverMapper.class);

		ReceiverAssosiation receiver = mapper.selectDetailReceivAssociation("201612091217531441");

		System.out.println(receiver);

		session.close();

	}

}
