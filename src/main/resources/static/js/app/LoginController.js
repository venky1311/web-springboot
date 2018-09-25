var app = angular.module('log', []);
app.controller('LoginController', function($scope) {
/*	$scope.username = 'venky';*/
	$scope.password = 'abc';

	$scope.login = function() 
	{
		if($scope.username =='venky' && $scope.password == 'abc')
			{
			console.log("successfully login!!");
			}
		else
			{
			console.error("unsuccessful");
			}

	}

});
