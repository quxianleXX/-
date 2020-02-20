<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/2/20
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<head>
    <title>雨量监测信息</title>
    <style>
        *{margin:0 auto}
        .list{
            width:800px;height:auto
        }
        .add{
            width:600px;
        }
    </style>
</head>
<body>

<div id="list">
    <h3 align="center">雨量监测信息</h3>
    <table border="1" align="center">

        <tbody align="center">
        <c:forEach items="${allinfo}" var="info">
            <tr>
                <td>序号</td>
                <td>区域名称</td>
                <td>监测时间</td>
            </tr>
        </c:forEach>
        <tr></tr>
        </tbody>
    </table>
    <div class="add"><a href="void(0)"onclick="">新增雨量监测信息</a></div>
</div>

</body>
</body>
</html>
