<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/reg" method="post">
    <label>
        <input type="text" placeholder="Введите имя" name="name">
    </label>
    <label>
        <input type="text" placeholder="Введите логин" name="login">
    </label>
    <label>
        <input type="text" placeholder="Введите возраст" name="age">
    </label>
    <label>
        <input type="text" placeholder="Введите пароль" name="pass">
    </label>
    <button type="submit">Ввод</button>
</form>

<a href="${pageContext.request.contextPath}/auth" methods="post">
    <button type="submit">Зарегестрироваться</button>
</a>

</body>
</html>
