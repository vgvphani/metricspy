function InfoController(infoService, $routeParams) {

    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshMetrics = refreshMetrics;
    vm.graphsCpuData = {};
    vm.graphsCpuOptions = {};
    vm.graphsDiskData = {};
    vm.graphsDiskOptions = {};
    vm.graphsMemData = {};
    vm.graphsMemOptions = {};

    function $onInit() {
        vm.hostname = $routeParams.hostname;
        vm.metrics = [];
        vm.refreshMetrics();
    }

    function refreshMetrics() {
        return infoService.list(vm.hostname).then(function refreshedMetrics(response) {
            vm.metrics = response.data;
            vm.graphsCpuData = compileCpuData(vm.metrics);
            vm.graphsDiskData = compileDiskData(vm.metrics);
            vm.graphsMemData = compileMemData(vm.metrics);
        });
    }


    function compileCpuData(metric) {
        cpuUsage = [];
        metric.forEach(function(datapoint) {
            cpuUsage.push({
                x: new Date(datapoint.timestamp),
                val_0: datapoint.cpuUsage})
        });

        data = {
            dataset0: cpuUsage
        };

        vm.graphsCpuOptions = {
            margin: {
                top: 20,
                right: 30,
                bottom: 20,
                left: 10
            },
            pan: {
                x: true,
                y: true
            },


            zoom: {
                x: true,
                y: true,
            },
            series: [
                {
                    axis: "y",
                    dataset: "dataset0",
                    key: "val_0",
                    label: "Cpu Usage",
                    color: "hsla(11, 85%, 5%, 1)",
                    type: ["line","dot"],
                    id: "mySeries0"
                }
            ],
            axes: {x:
                    {
                    key: "x", type: 'date', min: new Date('2017-11-28 00:00:00'), max: new Date('2017-12-09 00:00:00')
                    },
                    y:
                    {
                    min: 0,
                    max: 100}
                   }
        };

        return data;
    }

    function compileDiskData(metric) {
        diskUsage = [];
        metric.forEach(function(datapoint) {
            diskUsage.push({
                x: new Date(datapoint.timestamp),
                val_0: datapoint.diskUsage})
        });

        data = {
            dataset0: diskUsage
        };

        vm.graphsDiskOptions = {
            margin: {top: 20},
            series: [
                {
                    axis: "y",
                    dataset: "dataset0",
                    key: "val_0",
                    label: "Disk Usage",
                    color: "hsla(11, 85%, 5%, 1)",
                    type: ["line","dot"],
                    id: "mySeries0"
                }
            ],
            axes: {x: {key: "x", type: 'date', min: new Date('2017-11-27 00:00:00'), max: new Date('2017-12-09 00:00:00')},y:
                {
                    min: 0,
                    max: 100}
            }
        };

        return data;
    }

    function compileMemData(metric) {
        memUsage = [];
        metric.forEach(function(datapoint) {
            memUsage.push({
                x: new Date(datapoint.timestamp),
                val_0: datapoint.memoryUsage})
        });

        data = {
            dataset0: memUsage
        };

        vm.graphsMemOptions = {
            margin: {top: 20},
            series: [
                {
                    axis: "y",
                    dataset: "dataset0",
                    key: "val_0",
                    label: "Memory Usage",
                    color: "hsla(11, 85%, 5%, 1)",
                    type: ["line","dot"],
                    id: "mySeries0"
                }
            ],
            axes: {x: {key: "x", type: 'date', min: new Date('2017-11-27 00:00:00'), max: new Date('2017-12-09 00:00:00')},y:
                {
                    min: 0,
                    max: 100}
            }
        };

        return data;
    }


}
