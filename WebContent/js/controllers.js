'use strict';

/* Controllers */

var rokControllers = angular.module('rokControllers', []);

rokControllers.controller('LoginController', ['$scope', '$location', 
  function($scope, $location) {
	var url = "" + $location.$$absUrl;
	$scope.displayLoginError = (url.indexOf("error") >= 0);
 }]);

rokControllers.controller('DefinitionController', ['$scope', '$http', '$location', 
   function($scope, $http, $location) {
		$scope.definitions = {};
		
		$scope.findAll = function() {
			$http.get("definition")
				.success(function(data){
					$scope.definitions = data; 
			});
		};

		$scope.seeDetail = function(id) {
			$location.path('/definition/'+ id);
		}
		
		$scope.findAll();
}]);

rokControllers.controller('DefinitionDetailController', ['$scope', '$http', '$routeParams', 
   function($scope, $http, $routeParams) {
	
		$scope.definition = null; 
		
		$http.get("definition/" + $routeParams.definitionId)
			.success(function(data) {
				$scope.definition = data;
		});
}]);

rokControllers.controller('HeaderController', ['$scope', '$location', 
   function($scope, $location){
		
		$scope.isActive = function(viewLocation){
			return $location.path().indexOf(viewLocation) != -1;
		}
}]);