<form name="vm.noteForm" ng-submit="vm.onSubmit(vm.title, vm.text)" class="panel panel-default">
    <div class="panel-body">
        <div class="form-group">
            <label for="title">Title</label>
            <input id="title" name="title" class="form-control" ng-model="vm.title" type="text" placeholder="The title of your note ..." autocomplete="off" required>
        </div>

        <div class="form-group">
            <label for="text">Text</label>
            <textarea id="text" name="text" class="form-control" ng-model="vm.text" placeholder="The text of your note ..." required></textarea>
        </div>
    </div>

    <div class="panel-footer text-right">
        <button type="submit" class="btn btn-xs btn-success">Submit</button>
        <button type="reset" class="btn btn-xs btn-default" ng-click="vm.onReset()">Reset</button>
    </div>
</form>