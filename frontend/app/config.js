function appConfig($routeProvider) {
    $routeProvider
        .when('/', { template: '<dashboard></dashboard>' })
        .when('/graphs', { template: '<info></info>' })
        .otherwise({
            redirectTo: '/'
        })
}