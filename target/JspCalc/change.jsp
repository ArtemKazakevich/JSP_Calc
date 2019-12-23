<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/change" method="post">
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

<form action="${pageContext.request.contextPath}/personAccount" method="get">
    <button type="submit">Личный кабинет</button>
</form>

<form action="calculation.jsp" method="post">
    <button type="submit">Калькулятор</button>
</form>

</body>
</html>
