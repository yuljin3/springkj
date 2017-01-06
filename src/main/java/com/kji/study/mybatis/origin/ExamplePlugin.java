package com.kji.study.mybatis.origin;

import java.util.Properties;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

@Intercepts({
	@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}), @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}), @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
})
public class ExamplePlugin implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Object[] args = invocation.getArgs();
		MappedStatement ms = (MappedStatement)args[0];
		Object param = (Object)args[1];
		BoundSql boundSql = ms.getBoundSql(param);
		System.out.println("====================================");
		System.out.println(invocation.getMethod().getName());
		System.out.println("====================================");
		System.out.println(ms.getId());
		System.out.println("====================================");
		System.out.println(boundSql.getSql());
		System.out.println("====================================");
		System.out.println(param);
		System.out.println("====================================");
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}

}
