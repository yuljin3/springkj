package com.kji.study.annotation.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/**
 * @author kj
 *
 * 서블릿 3.0에서 제공하는 MultipartConfig와 Part를 이용하여 파일업로드 직접구현
 * @MultipartConfig : Request가 multi-part일 경우 저장위치, 최대크기등 설정 할 수 있음
 *
 */
@WebServlet("/fileUploadServlet")
@MultipartConfig(
	fileSizeThreshold=1024*1024*20, // 20M
	maxFileSize=1024*1024*10, // 10 MB
	maxRequestSize=1024*1024*30) // 30 MB)
public class FileUploadServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private static String FILE_UPLOAD_DIR = "/Users/NHNEnt/Documents/test/file/" ;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		File uploadDir = new File(FILE_UPLOAD_DIR);
		
		if (uploadDir.exists() == false) {
			uploadDir.mkdirs();
		}
		Collection<Part> parts = req.getParts();

		for (Part part : parts) {
			String uploadFile = uploadDir.getAbsolutePath() + File.separator + getFileName(part);
			writer.printf("SubmittedFileName=>%s File Size=>%10.2f KB Uploaded File Name=>%s " , part.getSubmittedFileName() , part.getSize()/1024.0,uploadFile );
			part.write(uploadFile);
		}
		req.setAttribute("message", "Upload has been done successfully!");
		getServletContext().getRequestDispatcher("/WEB-INF/view/message.jsp").forward(req, resp);
		
 	}

	private String getFileName(Part part) {
		
		String contentDisposition = part.getHeader("content-disposition");
		String[] tokens = contentDisposition.split(";");
		
		for (String string : tokens) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length()-1);
			}
		}
		
		return "";
	}
	
}
