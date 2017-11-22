angular.module('app', ['ngRoute'])
    .factory('metricService', metricService)
    .component('dashboard', {
        templateUrl: 'app/dashboard/dashboard.tpl',
        controller: DashboardController,
        controllerAs: 'vm'
    })
    .component('navigation', { templateUrl: 'app/navigation/navigation.tpl' })
    .component('info', { templateUrl: 'app/info/info.tpl' })
    .config(appConfig);