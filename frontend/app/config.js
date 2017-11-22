function appConfig($routeProvider) {
    $routeProvider
        .when('/', { template: '<dashboard></dashboard>' })
        .when('/info', { template: '<info></info>' })
        .otherwise({
            redirectTo: '/'
        })
}