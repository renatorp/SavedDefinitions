<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="pt-BR" id="ng-app" ng-app="">
<head>
        <%-- <title><spring:message  code="project.title" /></title> --%>
        <link href="<c:url value='/bower_components/bootstrap/dist/css/bootstrap.min.css'  />" rel="stylesheet"/>
        <%-- <link href="<c:url value='/resources/css/style.css'  />" rel="stylesheet"/> --%>
        <script src="<c:url value='/bower_components/jquery/dist/jquery.min.js' />"></script>
        <script src="<c:url value='bower_components/angular/angular.min.js' />"></script> 
    </head>
    <body>
        <div class="container">
            <tiles:insertAttribute name="header" />
 
            <tiles:insertAttribute name="body" />
        </div>
 
        <!--[if IE]>
            <script src="<c:url value='/resources/js/bootstrap.min.ie.js' />"></script>
        <![endif]-->
        <!--[if !IE]><!-->
            <script src="<c:url value='/bower_components/bootstrap/dist/js/bootstrap.min.js
' />"></script>
        <!--<![endif]-->
 
        <tiles:insertAttribute name="footer" />
    </body>
</html>