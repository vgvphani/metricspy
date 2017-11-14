function NoteController(noteService) {
    var vm = this;

    vm.$onInit = $onInit;

    vm.editNote = editNote;
    vm.removeNote = removeNote;
    vm.submitEditedNote = submitEditedNote;
    vm.resetEditedNote = resetEditedNote;
    vm.showError = showError;

    function $onInit() {
        // vm.notesController will be our parent controller (NotesController)
        // vm.data will contain the data of this note
        vm.resetEditedNote();
    }

    function editNote() {
        vm.isEditingNote = true;
    }

    function removeNote() {
        noteService.destroy(vm.data.id)
            .then(vm.notesController.refreshNotes);
    }

    function submitEditedNote(title, text) {
        return noteService.update(vm.data.id, title, text)
            .then(vm.notesController.refreshNotes)
            .then(vm.resetEditedNote)
            .catch(vm.showError);
    }

    function resetEditedNote() {
        vm.isEditingNote = false;
    }

    function showError(response) {
        alert(response.data.errors.join("\n"));
    }
}