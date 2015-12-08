/**
 * Created by ddelaney on 12/3/2015.
 */
app.controller('expenseReportCtrl', ['$scope', 'expenseReportFactory', 'LineItemTypes',
    function($scope, expenseReportFactory, LineItemTypes){
        $scope.expenseReport = {};

        $scope.lineItems = [];
        $scope.expenseReport.name = $scope.inputExpenseReportName;

        $scope.save = function(){
            expenseReport.name = $scope.inputExpenseReportName;
            expenseReport.lineItems = $scope.lineItems;
            expenseReportFactory.createExpenseReport(expenseReport);
        }

        $scope.addItem = function() {
            var item = {};
            item.type = $scope.dropdownvalue;

            var arr = $scope.lineItems;
            if(arr.indexOf(item) == -1){
                arr.push(item);
            }
        }

        $scope.LineItemTypes = LineItemTypes.data;

        $scope.validateDatMoney = function(datMoney) {
            console.log(datMoney);
        }
    }
]);