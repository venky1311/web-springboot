var empadd = angular.module("empapp",[]);
empadd.controller("EmployeeAdd", ["$scope", "$http",
	function($scope, $http)
	{
	$scope.userDto = {
			userName:"",
			passWord:""
	};
	$scope.EmpSave()=function () 
	{
		var method = "";
        var url = "";
        
		/*UserService.saveUser($scope.userDto).then(function()
		{
		console.log("works");
		});*/
        if($scope.userName != "")
        	{
        	method="PUT";
        	url="/employee"
        	}
        $http({
        	method:method,
        	url:url,
        	data:angular.toJson($scope.userDto),
        	headers:{
        		'Content-Type':'application/json'
        	}
        	
        })
	};
	
	
	
	}]);