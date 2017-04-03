var app = angular.module("app",[]);
app.controller("student",['$scope',function($scope)
{
 $scope.a = 20;
 $scope.b = 40;

 $scope.doSum = function()
 {
  $scope.b = $scope.b  * 3;
  $scope.a = $scope.a * 3;
  $scope.sum = parseInt($scope.a) + parseInt($scope.b);
 };
 $scope.doMul = function()
 {
  $scope.mul = parseInt($scope.a) * parseInt($scope.b);
 };
}])
