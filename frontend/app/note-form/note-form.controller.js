function NoteFormController(noteService) {
    var vm = this;

    vm.$onInit = $onInit;

    vm.onSubmit = vm.onSubmit || onUserDidSubmit;
    vm.onReset  = vm.onReset || onUserDidReset;

    vm.showError = showError;

    function $onInit() {
        var parentControllerHasSetData = angular.isDefined(vm.data);
        vm.title = parentControllerHasSetData ? vm.data.title : '';
        vm.text  = parentControllerHasSetData ? vm.data.text  : '';
    }

<<<<<<< HEAD

    /**
     * The default function for when the user presses 'Submit'. The default behaviour
     * for a form is to create a new note using the API.
     * @param {String} title
     * @param {String} text
     */
    function defaultSubmitForm(title, text) {
        noteService.createMetric(title, text)
            .then(function status(res) {
                console.log(res);
            });
        noteService.create(title, text)
=======
    function onUserDidSubmit(title, text) {
        return noteService.create(title, text)
>>>>>>> f4a54a68201c631610fc1d6b2a7351c0b4c45d51
            .then(vm.notesController.refreshNotes)
            .then(onUserDidReset)
            .catch(vm.showError);
    }

    function onUserDidReset() {
        vm.title = '';
        vm.text = '';
        vm.noteForm.$setPristine();
        vm.noteForm.$setUntouched();
    }

    function showError(response) {
        alert(response.data.errors.join("\n"));
    }
}