<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account</title>
</head>
<body>

<div>
    <p>
        ${currentUser}
    </p>
</div>

<form action="calculation.jsp" method="post">
    <button type="submit">Калькулятор</button>
</form>

<form action="${pageContext.request.contextPath}/change" method="get">
    <button type="submit">Редактирование данных</button>
</form>

</body>
</html>
