<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!--
PetClinic :: a Spring Framework demonstration
-->

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Bcart Project</title>
    
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    
    <spring:url value="/resources/css/shop-homepage.css" var="shop-homepage"/>
    <link href="${shop-homepage}" rel="stylesheet"/>
    
     <spring:url value="/resources/js/jquery.js" var="jquery"/>
    <script src="${jquery}"></script>
     <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapjs"/>
    <script src="${bootstrapjs}"></script>

</head>


