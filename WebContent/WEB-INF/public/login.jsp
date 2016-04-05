<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style type="text/css">
	.none{
		display:none;
	}
</style>

<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true" ng-controller="LoginController">
<%-- <legend><spring:message code="login.header" /></legend> --%>
  <div class="modal-dialog">
  
  <div class="modal-content">
      <div class="modal-header">
          <h1 class="text-center">Login</h1>
      </div>
      <div class="modal-body">
          <form id="login_form" class="form col-md-12 center-block" method="post" action="<c:url value='/postlogin' />">
            <div class="form-group">
              <input name="username" id="username" type="text" class="form-control input-lg" placeholder="Email">
            </div>
            <div class="form-group">
              <input name="password" id="password" type="password" class="form-control input-lg" placeholder="Password">
            </div>
            
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            
	        <div class="alert alert-danger" ng-class="{'': displayLoginError == true, 'none': displayLoginError == false}">
	        	Erro
	            <%-- <spring:message code="login.error" /> --%>
	        </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block" onclick="document.getElementById('login_form').submit();">Sign In</button>
            </div>
          </form>
      </div>
      <div class="modal-footer">
      </div>
  </div>
  </div>
</div>