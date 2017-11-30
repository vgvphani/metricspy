function DashboardController(metricService) {
    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;
    vm.hasHighCpuLoad = hasHighCpuLoad;
    vm.hasHighDiskLoad = hasHighDiskLoad;
    vm.hasHighMemoryUsage = hasHighMemoryUsage
    vm.hasNotReported = hasNotReported;

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

    function hasHighMemoryUsage(metric) {
        if (metric.memoryUsage>95)
            return "high"
        else if (metric.memoryUsage<85)
            return "good"
        else
            return "okay"

    }

    function hasNotReported(metric) {
        var a = (new Date().getTime())// for current time in epoch millisecs.
        var myDate = new Date(metric.timestamp);
        var myEpoch = myDate.getTime()
        var diff = (a - myEpoch)/(60*1000)
        return (diff>132)
    }

}