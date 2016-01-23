var chipotleControllers = angular.module('phonecatControllers', []);


chipotleControllers.controller('HomeCtrl', ['$scope', '$http', function($scope, $http) {

  $scope.getMessage = function() {
    $http({method: 'GET', url:'/home'})
        .success(function(data){
          $scope.message = data.data;
        })
    };
 }]);



