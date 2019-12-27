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

<a href="${pageContext.request.contextPath}/calc" methods="post">
    <button type="submit">Калькулятор</button>
</a>

<a href="${pageContext.request.contextPath}/change" methods="get">
    <button type="submit">Редактирование данных</button>
</a>

</body>
</html>
