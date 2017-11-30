function InfoController(metricService) {

    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;

    function $onInit() {
        vm.metrics = [];
        vm.refreshMetrics();
    }
}

function refreshMetrics() {
    return metricService.list().then(function refreshedMetrics(response) {
        vm.metrics = response.data;
    });
}
