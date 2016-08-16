angular.module('app', [])
    .factory('noteService', noteService)
    .component('noteForm', {
        templateUrl: 'app/note-form/note-form.tpl',
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
        templateUrl: 'app/notes/notes.tpl',
        controller: NotesController,
        controllerAs: 'vm'
    })
    .component('note', {
        templateUrl: 'app/note/note.tpl',
        controller: NoteController,
        controllerAs: 'vm',

        require: {
          notesController: '^notes'
        },

        bindings: {
            data: '<'
        }
    });