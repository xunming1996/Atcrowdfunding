<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 在访问欢迎界面时，请求转发到"/index"映射上
	request.getTequestDispatcher("/index").forward(request,response); --%>
	<jsp:forward page="/index"></jsp:forward>
</body>
</html>