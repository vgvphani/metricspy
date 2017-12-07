<div class="container">

    <h1><a href="#/">Dashboard</a></h1>
            <div class="panel-group">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        CpuUsage
                    </h4>
                </div>
            <div class="panel-body my-chart">
                <linechart data="vm.graphsCpuData" options="vm.graphsCpuOptions"></linechart>
            </div><br><hr><br>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading">DiskUsage</div>
            <div class="panel-body my-chart">
                <linechart data="vm.graphsDiskData" options="vm.graphsDiskOptions"></linechart>
            </div><br><hr><br>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading">MemoryUsage</div>
            <div class="panel-body my-chart">
                <linechart data="vm.graphsMemData" options="vm.graphsMemOptions"></linechart>
            </div><br><hr><br>
            </div>
            </div>
        </div>
