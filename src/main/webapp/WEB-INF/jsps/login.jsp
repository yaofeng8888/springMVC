<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/login" method="POST">
			======${name }
        <label for="username">用户名:<input type="text" id="username" name="username" /></label>
        <label for="password">密码:<input type="text" id="password" name="password" /></label>
        <label for="address">省份:<input type="text" id="pro" name="addr.pro" /></label>
        <label for="city">城市:<input type="text" id="city" name="addr.city" /></label>
        <input type="submit" value="登陆">
    </form>
</body>
</html>