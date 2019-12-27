<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/auth" methods="post">
    <button type="submit">Авторизация</button>
</a>

<a href="${pageContext.request.contextPath}/reg" methods="post">
    <button type="submit">Регстрация</button>
</a>

</body>
</html>
