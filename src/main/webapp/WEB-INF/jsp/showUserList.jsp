<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
   	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
   	<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<title>测试列表</title>
  </head>
  
  <body>
  	<table class="table table-striped table-hover table-bordered table-condensed">
  		<th>ID</th>
  		<th>用户名</th>
  		<th>密码</th>
  		<th>年龄</th>
  		<th>操作</th>
	    <c:forEach items="${list }" var="item">
	 		<tr>
	 			<td>
	 				${item.id }
	 			</td>
	 			<td>
	 				${item.userName }
	 			</td>
	 			<td>
	 				${item.password }
	 			</td>
	 			<td>
	 				${item.age }
	 			</td>
	 			<td>
	 				<a href="user/showUser?id=${item.id }">查看</a>
	 			</td>
	 		</tr>
	    </c:forEach>
    </table>
  </body>
</html>
