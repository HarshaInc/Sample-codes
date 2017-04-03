var app = angular.module('app', []);
    app.controller('example',['$scope',
      function($scope) {
               $scope.x = 20;
               $scope.y = 40;
              }
    ]);

app.directive('message',
  function()  {
            return{
              //restrict: 'EA',
              templateUrl:'info.html'
            }


    });
