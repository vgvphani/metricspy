<div class="container">

    <h1><a href="#/" >Dashboard</a></h1>
    <div class="row">
        <div class="col-xs-12">

            <p>CPU Usage
                <br>

            <input type="checkbox" class="button" value="CPU Usage" ng-model="MyVar1">

            <div class="my-chart" ng-show="MyVar1">
                <linechart data="vm.graphsCpuData" options="vm.graphsCpuOptions"></linechart>
            </div><br><hr><br>

            <p>Disk Usage
                <br>

            <input type="checkbox" ng-model="MyVar2">

            <div class="my-chart" ng-show="MyVar2">
                <linechart data="vm.graphsDiskData" options="vm.graphsDiskOptions"></linechart>
            </div><br><hr><br>

            <p>Memory Usage
                <br>

            <input type="checkbox" ng-model="MyVar3">

            <div class="my-chart" ng-show="MyVar3">
                <linechart data="vm.graphsMemData" options="vm.graphsMemOptions"></linechart>
            </div><br><hr>
        </div>
    </div>
</div>
<footer>
    <hr>
    <p style="background-color: white" align="center">&copy;&nbsp;MetricSpy</p>
    <hr>
</footer>
