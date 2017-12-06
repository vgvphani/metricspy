<div class="container-fluid">

    <h1><a href="#/">Dashboard</a></h1>

    <div class="row">
        <div class="col-xs-12" >

            <div class="my-chart">
                <linechart data="vm.graphsCpuData" options="vm.graphsCpuOptions"></linechart>
            </div>

            <div class="my-chart">
                <linechart data="vm.graphsDiskData" options="vm.graphsDiskOptions"></linechart>
            </div>

            <div class="my-chart">
                <linechart data="vm.graphsMemData" options="vm.graphsMemOptions"></linechart>
            </div>
            <!--{{vm.test(metric)}}-->
            <!--<table>-->
                <!--<tr ng-repeat="metric in vm.metrics">-->
                    <!--<td>{{ metric.hostname }}</td>-->
                    <!--<td>{{ metric.timestamp }}</td>-->
                    <!--<td>{{ metric.cpuUsage }}</td>-->
                    <!--<td>{{ metric.memoryUsage }}</td>-->
                    <!--<td>{{ metric.diskUsage }}</td>-->
                <!--</tr>-->
            <!--</table>-->
        </div>
    </div>
</div>