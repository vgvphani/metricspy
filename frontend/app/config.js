function appConfig($routeProvider) {
    $routeProvider
        .when('/', { template: '<notes></notes>' })
        .when('/info', { template: '<info></info>' })
        .otherwise({
            redirectTo: '/'
        })
}