'use strict';

/* Controllers */

var rokControllers = angular.module('rokControllers', []);

rokControllers.controller('LoginController', ['$scope', '$location', 
  function($scope, $location) {
	var url = "" + $location.$$absUrl;
	$scope.displayLoginError = (url.indexOf("error") >= 0);
 }]);
