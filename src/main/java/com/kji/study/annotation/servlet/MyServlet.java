package com.kji.study.annotation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kj
 *
 * web.xml의 servelt 등록 및 초기화를 통해 동작하는 servlet 이다. 
 * http://localhost:8080/MyServlet 을 통해 접속 및 테스트 가능하다. 
 *
 */

public class MyServlet extends HttpServlet{

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
		writer.println("<h1>" + getInitParameter("initParam1") + "</h1><br/>");
		writer.println("<h1>" + getInitParameter("initParam2") + "</h1><br/>");
	}
}
