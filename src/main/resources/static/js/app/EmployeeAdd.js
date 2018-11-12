var empadd = angular.module("empapp",[]);
empadd.controller("EmployeeAdd", function($scope, $http)
	{
	
	$scope.userDto = [];
	$scope.userForm = {
			userName:"",
			passWord:"",
			alert: "entered the function of controller"
	};
	$scope.EmpSave=function () 
	{
		var method = "";
        var url = "";
        
		/*UserService.saveUser($scope.userDto).then(function()
		{
		console.log("works");
		});*/
        if($scope.userForm.userName != "")
        	{
        	method="POST";
        	url="/employee";
        	alert("trying to save info");
        	console.log("**************************************");
        	}
      /*  $http({
        	method:method,
        	url:url,
        	data:angular.toJson($scope.userForm),
        	headers:{
        		'Content-Type':'application/json'
        	}
        	
        });*/
	};
	});