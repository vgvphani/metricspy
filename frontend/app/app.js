angular.module('app', ['ngRoute'])
    .factory('metricService', metricService)
    .component('dashboard', {
        templateUrl: 'app/dashboard/dashboard.tpl',
        controller: DashboardController,
        controllerAs: 'vm'
    })
    // .component('metrics-graphs', {
    //     templateUrl: 'app/metrics-graphs/metrics-graphs.tpl'
    //     controller: DashboardController,
    //     controllerAs: 'vm'
    // })
    // .component('navigation', { templateUrl: 'app/navigation/navigation.tpl' })
    .component('info', {
        templateUrl: 'app/info/info.tpl',
        controller: InfoController,
        controllerAs: 'vm'
    })
    .config(appConfig);