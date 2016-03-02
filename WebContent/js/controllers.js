'use strict';

/* Controllers */

var rokControllers = angular.module('rokControllers', []);

rokControllers.controller('LoginController', ['$scope', '$location', 
  function($scope, $location) {
	var url = "" + $location.$$absUrl;
	$scope.displayLoginError = (url.indexOf("error") >= 0);
 }]);

rokControllers.controller('DefinitionController', ['$scope', '$http',
   function($scope, $http) {
		$scope.definitions = {};
		
		$scope.findAll = function() {
			$http.get("definition")
				.success(function(data){
					$scope.definitions = data; 
			});
		};
		
		$scope.findAll();
}]);