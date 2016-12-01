<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fileUploadServlet" method="post" enctype="multipart/form-data">
		파일 1 선택:<input type="file" name="fileName"><br/>
		파일 2 선택:<input type="file" name="fileName"><br/>
		파일 2 선택:<input type="file" name="fileName"><br/>
		<input type="submit" value="Upload">
	</form>
</body>
</html>