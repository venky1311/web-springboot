var app = angular.module('log', []);
/*app.config(function($RouteProvider){
	$RouteProvider
	.when("/login", 
			{
				templateUrl: "login.html"
			});
});*/
app.controller('LoginController', function($scope) {
/*	$scope.username = 'venky';
	$scope.password = 'abc';*/

	$scope.login = function() 
	{
		 if($scope.username =='venky' && $scope.password == 'abc')
			{
			 alert("success");
			console.log("successfully login!!");
			}
		else
			{
			console.log();
			console.error("unsuccessful");
			}
	}
});






