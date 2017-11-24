function DashboardController(metricService) {
    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;
    vm.hasHighCpuLoad = hasHighCpuLoad;
    vm.hasHighDiskLoad = hasHighDiskLoad;
    function $onInit() {
        vm.metrics = [];
        vm.refreshMetrics();
    }

    function refreshMetrics() {
        return metricService.list().then(function refreshedMetrics(response) {
            vm.metrics = response.data;
        });
    }

    function hasHighCpuLoad(metric) {
        if (metric.cpuUsage>30)
            return "high"
       else if (metric.cpuUsage<5)
           return "good"
        else
            return "okay"
    }

    function hasHighDiskLoad(metric) {
        if (metric.diskUsage>60)
            return "high"
        else if (metric.diskUsage<35)
            return "good"
        else
            return "okay"
    }
}