<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>用户管理-后台管理系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="../static/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../static/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../static/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../static/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <c:import url="navi.jsp"/>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">用户管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	编辑用户
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="saveUser" method="POST">
                                        <div class="form-group">
                                            <label>用户名</label>
                                            <input type="hidden" name="id" value="${user.id }"/>
                                            <input class="form-control" placeholder="请输入用户名" name="userName" value="${user.userName }">
                                        </div>
                                        <div class="form-group">
                                            <label>密码</label>
                                            <input class="form-control" placeholder="请输入密码,置空为不修改" name="password" type="password">
                                        </div>
                                        <div class="form-group">
                                            <label>年龄</label>
                                            <input class="form-control" placeholder="请输入年龄" name="age" value="${user.age }">
                                        </div>
                                        <div class="form-group">
                                            <label>头像</label>
                                            <input type="file">
                                        </div>
                                        <div class="form-group">
                                            <label>备注</label>
                                            <textarea class="form-control" rows="3" placeholder="请输入备注" name="memo">${user.memo }</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>爱好</label>
                                            <c:forEach items="${favoriteList }" var="item">
                                            	<label class="checkbox-inline">
                                                	<input name="favorite" type="checkbox" value="${item.code }" ${myFavoriteMap[item.code]==true?"checked='checked'":"" } >${item.name }
                                            	</label>
                                            </c:forEach>
                                        </div>
                                        <div class="form-group">
                                            <label>性别</label>
                                            <label class="radio-inline">
                                                <input type="radio" name="gender" id="gendermale" value="male" ${user.gender=="male"?"checked":"" } >男
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="gender" id="genderfemale" value="female" ${user.gender=="female"?"checked":"" }>女
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="gender" id="genderother" value="other" ${user.gender=="other"?"checked":"" }>其他
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <label>地区</label>
                                            <select class="form-control" name="district">
                                                <option value="beijing" ${user.district=="beijing"?"selected='selected'":"" } >北京</option>
                                                <option value="hebei" ${user.district=="hebei"?"selected='selected'":"" }>河北</option>
                                                <option value="other" ${user.district=="other"?"selected='selected'":"" }>其他</option>
                                            </select>
                                        </div>
                                        <button type="submit" class="btn btn-default btn-success">保存</button>
                                        <button type="reset" class="btn btn-default">重置</button>
                                    </form>
                                </div>
                                
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../static/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../static/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../static/dist/js/sb-admin-2.js"></script>

</body>

</html>
