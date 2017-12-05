function appConfig($routeProvider) {
    $routeProvider
        .when('/', { template: '<dashboard></dashboard>' })
        .when('/graphs/:hostname', { template: '<info></info>' })
        .otherwise({
            redirectTo: '/'
        })
}