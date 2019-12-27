<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Error</title>
</head>
<body>

<c:if test="${flagOne}">
    <div>
        <p>Вы неправильно ввели "логин" либо "пароль"!</p>
    </div>
    <a href="index.jsp">
        <button type="submit">На главную</button>
    </a>
</c:if>

<c:if test="${flagTwo || flagThree}">
    <div>
        <p>В доступе отказанно. Вы не зарегестрированный пользователь.</p>
    </div>
    <a href="index.jsp">
        <button type="submit">На главную</button>
    </a>
</c:if>

</body>
</html>
