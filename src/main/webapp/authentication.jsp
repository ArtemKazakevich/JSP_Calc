<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentication</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/auth" method="post">
    <label>
        <input type="text" placeholder="Введите логин" name="login">
    </label>
    <label>
        <input type="text" placeholder="Введите пароль" name="pass">
    </label>
    <button type="submit">Ввод</button>
</form>

<a href="${pageContext.request.contextPath}/calc" methods="post">
    <button type="submit">Авторизация</button>
</a>

</body>
</html>
