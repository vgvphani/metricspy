<div class="container-fluid" >
    <h1 class="page-header"><u>MetricSpy</u> <small>spy your server</small></h1>
<<<<<<< HEAD
    <div id="weekend" class="row col-md-6 center-block panel" ng-class="vm.hasNotReported(metric)? 'panel-success':'panel-danger'" ng-repeat="metric in vm.metrics">
        <div class="panel-heading">
            <h3 class="panel-title">{{metric.hostname}}</h3>
        </div>
        <div class="panel-body">
            <ul class="list-group">
                <li class="list-group-item">Timestamp <span class="label label-default" >{{metric.timestamp}}</span></li>
                <li class="list-group-item">CpuUsage <ng-switch on="vm.hasHighCpuLoad(metric)">
                    <span ng-switch-when="high" class="label label-danger">{{metric.cpuUsage}}</span>
                    <span ng-switch-when="good" class="label label-success">{{metric.cpuUsage}}</span>
                    <span ng-switch-when="okay" class="label label-warning">{{metric.cpuUsage}}</span>
                </ng-switch></li>
                <li class="list-group-item">DiskUsage <ng-switch on="vm.hasHighDiskLoad(metric)">
                    <span ng-switch-when="high" class="label label-danger">{{metric.diskUsage}}</span>
                    <span ng-switch-when="good" class="label label-success">{{metric.diskUsage}}</span>
                    <span ng-switch-when="okay" class="label label-warning">{{metric.diskUsage}}</span>
                </ng-switch></li>
                <li class="list-group-item">MemoryUsage <span class="label label-default">{{metric.memoryUsage}}</span></li>
            </ul>
        </div>
        <div class="list-group">
            <a href="#/graphs" class="list-group-item active">Detailed View</a>
=======
<!--
    <div class="row">
        <div class="col-lg-offset-2">
-->
        <div id="weekend" class="row col-md-6 center-block panel panel-default" ng-class="vm.contentDelay()?'panel-content-danger':'panel-content-success'" ng-repeat="metric in vm.metrics">
            <div class="panel-heading">
                <h3 class="panel-title">{{metric.hostname}}</h3>
            </div>
                <div class="panel-body" ng-class="vm.contentDelay()?'panel-heading-custom':'notice-default'">
                    <ul class="list-group">
                        <li class="list-group-item">Timestamp <span  class="label label-default" >{{metric.timestamp}}</span></li>
                        <li class="list-group-item">CpuUsage <ng-switch on="vm.hasHighCpuLoad(metric)">
                        <span ng-switch-when="high" class="label label-danger">{{metric.cpuUsage}}</span>
                        <span ng-switch-when="good" class="label label-success">{{metric.cpuUsage}}</span>
                        <span ng-switch-when="okay" class="label label-warning">{{metric.cpuUsage}}</span>
                        </ng-switch></li>
                        <li class="list-group-item">DiskUsage <ng-switch on="vm.hasHighDiskLoad(metric)">
                        <span ng-switch-when="high" class="label label-danger">{{metric.diskUsage}}</span>
                        <span ng-switch-when="good" class="label label-success">{{metric.diskUsage}}</span>
                        <span ng-switch-when="okay" class="label label-warning">{{metric.diskUsage}}</span>
                        </ng-switch></li>
                        <li class="list-group-item">MemoryUsage <span class="label label-default">{{metric.memoryUsage}}</span></li>
                    </ul>
                </div>
            <div class="list-group">
        <a href="#/graphs" class="list-group-item active">Detailed View</a>
            </div>
         </div>
<!--
>>>>>>> 75aa4ec91807676498ce8be41544eb98bdfe4dcc
        </div>
    </div>
</div>
<footer>
    <hr>
    <p align="center">&copy;&nbsp;MetricSpy</p>
    <hr>
</footer>


<!--{{vm.hasNotReported(metric)}};ng-class="{{vm.hasNotReported(metric)? 'dori':'nemo'}}"-->