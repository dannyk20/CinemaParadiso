<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		alert('로그인 후 이용할 수 있습니다');
		location.replace('loginForm.jsp');
	</script>
<span style="color: red;">${param.message}</span>
</body>
</html>