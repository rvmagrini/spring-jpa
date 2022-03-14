<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="theme-color" content="#563d7c">
    <title>Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <style>
        form {
            padding: 20px;
        }

        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            border-radius: 5px;
            padding: 8px;
            margin: 16px;
        }

    </style>
</head>
<body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
        <a class="navbar-brand" href="#">HOME</a>
    </nav>

    <div class="container">
        <div>
            <h1>Registration</h1>
        </div>

        <form:form modelAttribute="registration">
            <label for="textinput1">
                Enter Registration:
            </label>
            <form:input path="name" cssErrorClass="error" />
            <form:errors path="name" cssClass="error" />
            <br/>
            <input type="submit" class="btn btn-lg btn-primary" role="button" value="Add Registration"/>
            <form:errors path="*" cssClass="errorblock" element="div" />
        </form:form>

        <div class="control-group">
        </div>
    </div>
</body>
</html>