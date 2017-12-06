angular.module('app', ['ngRoute','n3-line-chart'])
    .factory('metricService', metricService)
    .component('dashboard', {
        templateUrl: 'app/dashboard/dashboard.tpl',
        controller: DashboardController,
        controllerAs: 'vm'
    })
    // .component('navigation', { templateUrl: 'app/navigation/navigation.tpl' })
    .factory('infoService', infoService)
    .component('info', {
        templateUrl: 'app/info/info.tpl',
        controller: InfoController,
        controllerAs: 'vm'
    })
    .config(appConfig);