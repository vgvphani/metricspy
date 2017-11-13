function NotesController(noteService) {
    var vm = this;

    vm.$onInit = $onInit;
    vm.refreshNotes = refreshNotes;
    vm.hasNotes = hasNotes;

    function $onInit() {
        vm.notes = [];
        vm.refreshNotes();
    }

    function refreshNotes() {
        return noteService.list().then(function refreshedNotes(response) {
            vm.notes = response.data;
        });
    }

    function hasNotes() {
        return vm.notes.length > 0;
    }
}