<div class="container-fluid" >
    <h1 class="page-header"><u>MetricSpy</u> <small>spy your server</small></h1>
    <hr>
    <div><p align="center" class="refreshpg"><a href="#/reload()">Click here to get latest metrics</a></p></div>
    <hr>

        <div id="weekend" class="row col-md-6 center-block panel panel-default" ng-class="vm.hasNotReported(metric)?'panel-danger':'panel-success'" ng-repeat="metric in vm.metrics">
            <div class="panel-heading">
                <h3 class="panel-title">{{metric.hostname}}</h3>
            </div>
                <div class="panel-body" ng-class="vm.hasNotReported(metric)?'panel-heading-custom':'notice-default'">
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
                        <li class="list-group-item">Memory Usage <ng-switch on="vm.hasHighMemoryUsage(metric)">
                            <span ng-switch-when="high" class="label label-danger">{{metric.memoryUsage}}</span>
                            <span ng-switch-when="good" class="label label-success">{{metric.memoryUsage}}</span>
                            <span ng-switch-when="okay" class="label label-warning">{{metric.memoryUsage}}</span>
                        </ng-switch></li>
                    </ul>
                </div>
            <div class="list-group">
        <a ng-href="#/graphs/{{metric.hostname}}" class="list-group-item active">Detailed View</a>
            </div>
         </div>
</div>

<footer>
    <hr>
    <p align="center">&copy;&nbsp;MetricSpy</p>
    <hr>
</footer>


<!--{{vm.hasNotReported(metric)}};ng-class="{{vm.hasNotReported(metric)? 'dori':'nemo'}}"-->