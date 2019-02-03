///reference path="angular.js"

 angular.module("ExpenseApp", ["ngRoute"]).config(function($routeProvider){
     $routeProvider
     .when(
         "/home",{
             templateUrl:"views/home.html"
           
         })
         .when(
            "/login",{
                templateUrl:"views/Login.html",
                controller: '/scripts/controller/LoginCtrl.js'
            })
            .when(
                "/about",{
                    templateUrl:"views/aboutus.html"
                
                })
                .when(
                    "/todo",{
                        templateUrl:"views/todo.html"
                    
                    })
            .when(
                "/",{
                    templateUrl:"views/home.html"
                
                }
             
    );
 });
