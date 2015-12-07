/**
 * Created by ddelaney on 12/3/2015.
 */
app.controller('expenseReportCtrl', ['$scope', 'expenseReportFactory', 'LineItemTypes','projectFactory',
    function($scope, expenseReportFactory, LineItemTypes, projectFactory){
        var expenseReport = {};
        $scope.lineItems = [];
        expenseReport.name = $scope.inputExpenseReportName;

        $scope.save = function(){
            expenseReport.name = $scope.inputExpenseReportName;
            expenseReportFactory.createExpenseReport(expenseReport);
        }

        $scope.addItem = function(){
            var item = $scope.dropdownvalue;
            var arr = $scope.lineItems;
            if(arr.indexOf(item) == -1){
            arr.push(item);
            }
        }

        $scope.LineItemTypes = LineItemTypes.data;
    }
]);