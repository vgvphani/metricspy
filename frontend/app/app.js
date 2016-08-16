angular.module('app', [])
    .factory('noteService', noteService)
    .component('noteForm', {
        templateUrl: 'note-form/note-form.tpl',
        controller: NoteFormController,
        controllerAs: 'vm',

        require: {
            notesController: '^notes'
        },

        bindings: {
          data: '<',
          onSubmit: '<',
          onReset: '<'
        }
    })
    .component('notes', {
        templateUrl: 'notes/notes.tpl',
        controller: NotesController,
        controllerAs: 'vm'
    })
    .component('note', {
        templateUrl: 'note/note.tpl',
        controller: NoteController,
        controllerAs: 'vm',

        require: {
          notesController: '^notes'
        },

        bindings: {
            data: '<'
        }
    });