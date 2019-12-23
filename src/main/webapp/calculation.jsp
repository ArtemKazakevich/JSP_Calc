<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>

<div>
    <p>
        Привет ${sessionScope.name}
    </p>
</div>

<form action="${pageContext.request.contextPath}/calc" method="post">
    <label>
        <input type="text" placeholder="Введите число а" name="a">
    </label>

    <label>
        <select name="title">
            <option value="add">+</option>
            <option value="sub">-</option>
            <option value="multi">*</option>
            <option value="div">:</option>
        </select>
    </label>

    <label>
        <input type="text" placeholder="Введите число b" name="b">
    </label>
    <button type="submit">Calculation</button>
</form>

<div>
    <p>
        Ваш результат = ${requestScope.result}
    </p>
</div>

<form action="${pageContext.request.contextPath}/history" method="get">
    <button type="submit">История</button>
</form>

<form action="${pageContext.request.contextPath}/personAccount" method="get">
    <button type="submit">Личный кабинет</button>
</form>

<form action="${pageContext.request.contextPath}/logout" method="get">
    <button type="submit">Выход</button>
</form>

</body>
</html>
