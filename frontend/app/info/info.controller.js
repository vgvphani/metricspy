function InfoController(infoService, $routeParams) {

    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;

    function $onInit() {
        vm.hostname = $routeParams.hostname;
        vm.metrics = [];
        vm.refreshMetrics();
    }

    function refreshMetrics() {
        return infoService.list(vm.hostname).then(function refreshedMetrics(response) {
            vm.metrics = response.data;
        });
    }
}
