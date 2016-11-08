<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Incorrect Data</title>
    <style>
        fieldset {
            background: #c0ff9c;
            color: #760b0c;
            border: 15pt ridge #9b146c;
            width: 50%;
            font-family: sans-serif;
            font-size: 90%;
            position: absolute;
            top: 30%;
            //bottom: 25%;
            left: 22.5%;
            //right: 2%;
        }
    </style>
</head>

<body style="background-color: rgba(205,255,192,0.92)">
    <fieldset>
        <p align="center"> <font size="7" color="red" face="Arial"><b>Incorrect Data!</b></font> </p>
        <b><c:out value="${invalid}"/></b>
        <br/><br/>
        <form action="${pageContext.request.contextPath}/factsAboutNum/">
            <label for="name"><b>Please, try again:</b></label>
            <input name="expr" id="name" type="text">
        </form>
    </fieldset>
</body>

</html>
