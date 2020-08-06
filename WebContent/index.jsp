<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="process.jsp" method="post">
		<input type="text" name="name" value="Name..." onclick="this.value=''" /><br />
		<input type="text" name="email" value="Email ID..."
			onclick="this.value=''" /><br /> <input type="password" name="pass"
			value="Password..." onclick="this.value=''" /><br /> <input
			type="submit" value="register" />
	</form>

	<a href="login.jsp">login</a>

	<form action="upload.jsp" method="post" enctype="multipart/form-data">
		아이디 : <input type="text" name="id"><br> 
		제목 : <input type="text" name="subject"><br> 
		파일첨부 : <input type="file" name="fileName1"><br> 
		<input type="submit" value="upload">
	</form>


</body>
</html>