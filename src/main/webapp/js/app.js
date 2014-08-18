angular.module('app', [])
    .controller('MainController', ['$http', function($http){
        var vm = this;

        vm.credential = {
            name: '',
            password: ''
        };

        vm.submit = function(){
            console.log('credential', vm.credential)
            $http.post('/api/login', vm.credential).then(
                function(response){
                    vm.data = response.data;
                },
                function(response){
                    vm.errorMessage = response.data.errorMessage;
                }
            );
        };

        return vm;
    }]);