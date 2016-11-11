<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Facts</title>
    <style>
        fieldset {
            background: #c0ff9c;
            color: #1c1385;
            border: 15px ridge #9b146c;
            width: 50%;
            font-family: sans-serif;
            font-size: 120%;
            position: absolute;
            top: 12.5%;
            //bottom: 25%;
            left: 22.5%;
            //right: 2%;
        }
    </style>
</head>

<body style="background-color: rgba(205,255,192,0.92)">
    <fieldset>
        <p align="center"> <font size="7" color="#9b146c" face="Arial"><b>Facts!</b></font> </p>
        <form action="${pageContext.request.contextPath}/factsAboutNum/">
            <label for="name">Please, enter your math expression: </label>
            <input name="expr" id="name" type="text">
        </form>
        <h4>The expression is: <c:out value="${expr}"/></h4>
        <h4>The result rounded to int is: <c:out value="${res}"/></h4>
        <h4>Some facts about this number:</h4>
        <ul>
            <c:forEach var="entry" items="${facts}">
                <li><b><c:out value="${entry.key}"/></b>: <c:out value="${entry.value}"/></li>
            </c:forEach>
        </ul>
    </fieldset>
</body>

</html>
