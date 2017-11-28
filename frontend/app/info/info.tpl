<div class="container-fluid">

    <h1><a href="#/">Dashboard</a></h1>

    <div class="row">
        <div class="col-xs-12">
            <hr><br>
            <h2>This is the Graphs page.</h2> <br>
            <hr>
            <!--<canvas id="vm.metricsSpyGraph"></canvas>-->


            <canvas id="myCanvas" ng-class="vm.options" width="900" height="300"
                    style="border:1px solid #000000;">
            </canvas>

            <br>
            <footer>
                <hr id="footerhr">
                <p align="center">Click on Dashboard bar to go back.
                <p align="center">&copy;&nbsp;MetricSpy</p>
                <hr id="footerhr">
            </footer>
        </div>
    </div>
</div>