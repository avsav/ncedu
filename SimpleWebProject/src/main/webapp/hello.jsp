<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Hello</title>
    <style>
        fieldset {
            background: #c0ff9c;
            color: #8e0309;
            border: 15px ridge #9b146c;
            width: 50%;
            font-family: sans-serif;
            font-size: 150%;
            position: absolute;
            top: 22.5%;
            //bottom: 25%;
            left: 22.5%;
            //right: 2%;
        }
    </style>
</head>

<body style="background-color: rgba(205,255,192,0.92)">
    <fieldset>
        <p>
            <%@ page import="java.util.HashSet,java.util.Set,java.util.Date,java.text.SimpleDateFormat" %>

            <%! Set acquaintances = new HashSet(); %>

            <%
            String name = request.getParameter("name");
            if (name == null || name.isEmpty()) {
                name = "";
            }
            Date date = new Date();
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy hh:mm");
            %>

            Hello, Dear Friend! <br/><br/>
            It's beautiful day: <%= f.format(date) %>

            <form>
            What is your name? <input name="name" type=text autofocus required>
            </form>

            <% acquaintances.add(name);
            if (!name.isEmpty()) {
            %> <%= name %>
            <a href="${pageContext.request.contextPath}/factsAboutNum/">please, click to continue!</a>
            <% } %>
        </p>
    </fieldset>
</body>

</html>
