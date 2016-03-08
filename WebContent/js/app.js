'use strict';

/* App Module */

var rippleOfKnowledgeApp = angular.module('rippleOfKnowledgeApp', [
  'ngRoute',                                                        
  'rokControllers',
  'summernote'
]);

rippleOfKnowledgeApp.config(['$routeProvider',
    function($routeProvider) {
      $routeProvider.
        when('/definitions', {
        	templateUrl: 'partials/definitionList',
        	controller: 'DefinitionController',
        	activeMenu: 'home'
        }).
        when('/definition/new', {
        	templateUrl: 'partials/definitionEdit',
        	controller: 'DefinitionEditController'
        }).
        when('/definition/:definitionId', {
        	templateUrl: 'partials/definitionDetail',
            controller: 'DefinitionDetailController'
        }).
        otherwise({
          redirectTo: '/definitions'
        });
}]);