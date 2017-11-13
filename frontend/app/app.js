angular.module('app', ['ngRoute'])
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
    })
    .component('notes', {
        templateUrl: 'app/notes/notes.tpl',
        controller: NotesController,
        controllerAs: 'vm'
    })
    .component('navigation', { templateUrl: 'app/navigation/navigation.tpl' })
    .component('info', { templateUrl: 'app/info/info.tpl' })
    .config(appConfig);