<div class="container">

    <h1><a href="#/">Dashboard</a></h1>

    <div class="row">
        <div class="col-xs-12">

            <div class="my-chart">
                <linechart data="vm.graphsCpuData" options="vm.graphsCpuOptions"></linechart>
            </div><br><hr><br><hr><br>

            <div class="my-chart">
                <linechart data="vm.graphsDiskData" options="vm.graphsDiskOptions"></linechart>
            </div><br><hr><br><hr><br>

            <div class="my-chart">
                <linechart data="vm.graphsMemData" options="vm.graphsMemOptions"></linechart>
            </div><br><hr>
        </div>
    </div>
</div>
<footer>
    <hr>
    <p align="center">&copy;&nbsp;MetricSpy</p>
    <hr>
</footer>
