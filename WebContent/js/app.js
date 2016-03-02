'use strict';

/* App Module */

var rippleOfKnowledgeApp = angular.module('rippleOfKnowledgeApp', [
  'ngRoute',                                                        
  'rokControllers'
]);

rippleOfKnowledgeApp.config(['$routeProvider',
    function($routeProvider) {
      $routeProvider.
        when('/definitions', {
          templateUrl: 'partials/definitionList',
          controller: 'DefinitionController'
        }).
        otherwise({
          redirectTo: '/definitions'
        });
}]);