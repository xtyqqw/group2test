<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="<%=request.getContextPath()%>/index/indexcontroller">用户与产品</a>
<a href="<%=request.getContextPath()%>/product/toProduct">添加产品</a>
<a href="<%=request.getContextPath()%>/customer/toCustomer">添加客户</a>
<a href="<%=request.getContextPath()%>/user/toLogin">登陆</a>
</body>
</html>
