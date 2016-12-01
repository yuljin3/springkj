package com.kji.study.annotation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author kj
 *
 * web.xml의 설정 없이 servlet 3.0에서 제공하는 @WebServlet 을 이용하여 서블릿 등록 및 설정
 * http://localhost:8080/MyAnnotationServle 을 통해 테스트 가능 
 *
 */
@WebServlet(description="first Servlet"
	, displayName="MyAnnotationServlet"
	, name="MyAnnotationServlet"
	, urlPatterns = {
		"/MyAnnotationServlet"
	}
	, initParams = {
		@WebInitParam(name="initParam1", value="initValue1"),
		@WebInitParam(name="initParam2", value="initValue2")
	}
)
public class MyAnnotationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doService(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doService(req, resp);
	}
	
	private void doService(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Annotation Servlet" + "</h1><br/>");
		writer.println("<h1>" + getInitParameter("initParam1") + "</h1><br/>");
		writer.println("<h1>" + getInitParameter("initParam2") + "</h1><br/>");
	}
	
	
	
}
