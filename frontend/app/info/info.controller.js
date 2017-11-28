function InfoController(metricService) {

    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;
    vm.myLineChart = myLineChart;

    function $onInit() {
        vm.metrics = [];
        vm.refreshMetrics();
    }
}
