var app = angular.module('app', []);
    app.controller('example',['$scope',
      function($scope) {
               $scope.x = 20;
               $scope.y = 40;

               $scope.z = 50;
               $scope.a = 60;

              }
    ]);
app.directive('message', function()
{
  return {
    restrict: 'EA',
    templateUrl:'new.html',
    scope :{
               a:'@',
               x: '@'
            },

            controller : function($scope,$element,$attrs){
             $scope.doAdd = function()

             {
              var u = parseInt($scope.a) + parseInt($scope.x);
              alert("sum is " + u);
             }
            }

         }
});

app.directive('message2', function()
{
  return {
    restrict: 'EA',
    templateUrl:'new.html',
    scope :{
               a:'@s',
               x: '@t'
            },
            controller : function($scope,$element,$attrs){
             $scope.doAdd = function()

             {
              var u = parseInt($scope.a) + parseInt($scope.x);
              alert("sum is " + u);
             }
            }

         }
});

