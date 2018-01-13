<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
	<h1>获取用户列表</h1>
	<a href="javascript:void(0)" onclick="deleteById()">删除</a>
	<form action="order/1" method="post" id="deleteForm">
		<input type="hidden" name="_method" value="DELETE" />
	</form>


	<a href="javascript:void(0)" onclick="updateById()">修改</a>
	<form action="order/1" method="post" id="updateForm">

		<input type="hidden" name="_method" value="PUT" />

	</form>

	<script>
		function deleteById() {
			var form = document.getElementById("deleteForm");
			form.submit();
		}

		function updateById() {
			var form = document.getElementById("updateForm");
			form.submit();
		}
	</script>

</body>
</html>