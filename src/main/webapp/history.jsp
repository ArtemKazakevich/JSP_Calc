<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>

<div>
    <ul>
        <c:forEach items="${history}" var="h">
            <li>${h}</li>
        </c:forEach>
    </ul>
</div>
<form action="calculation.jsp" method="post">
    <button type="submit">Калькулятор</button>
</form>

</body>
</html>
