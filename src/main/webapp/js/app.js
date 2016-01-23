var myApp = angular.module('chipotleApp', ['chipotleControllers', 'ngRoute']);

chipotleApp.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
			when('/home', {
				templateUrl: 'partials/home.html',
				controller: 'HomeCtrl'
			}).
			otherwise({
				redirectTo: '/home'
			});
	}
]);

