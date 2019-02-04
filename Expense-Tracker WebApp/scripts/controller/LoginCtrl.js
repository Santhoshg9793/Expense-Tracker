ExpenseApp.controller("LoginCtrl",[$scope, $http,$location,
function ($scope, $http,$location) {

    console.log("inside function clock");
    $scope.userLogin = function () {     
        var data1 = {
            "userName": $scope.userName,
            "password": $scope.pwd
        };
        // send login data
       $http({
            method: 'POST',
            url: 'http://localhost:8081/api/user/auth',
            data: JSON.stringify(data1),
            headers: { 'Content-Type': 'application/json' }
        })
        .then(
            function (response) {            
                console.log(response); 
                if(response.data.message==="User login successfully!!") {
                    $scope.isCorrectUser=true;
                    $window.location.href = '/home.html'; 
                }
            
              //  $location.path('/home');           
            });        
    };
}]);
