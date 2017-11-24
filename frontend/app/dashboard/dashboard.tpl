<div class="container" >
    <h1 class="page-header"><u>MetricSpy</u> <small>spy your server</small></h1>
        <div class="row col-sm-5 panel panel-default" ng-repeat="metric in vm.metrics">
            <div class="panel-heading">
        <h3 class="panel-title">{{metric.hostname}}</h3>
        </div>
            <div  class="panel-body">
                <ul class="list-group">
                    <li class="list-group-item">Timestamp <span class="label label-default">{{metric.timestamp}}</span></li>
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
        <a href="#/info" class="list-group-item active">Detailed View</a>
            </div>
        </div>
</div>

