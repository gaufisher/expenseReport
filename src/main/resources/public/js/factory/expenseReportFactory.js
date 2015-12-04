/**
 * Created by ddelaney on 12/3/2015.
 */
app.factory('expenseReportFactory', ['$http',
    function($http) {
        return {
            createExpenseReport: function(){
                return $http.post('/expense-report');
            },
            getDatExpenseReport: function(){
                return $http.get('/expense-report');
            }
        };
    }
]);