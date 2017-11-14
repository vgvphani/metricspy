function noteService($http, $interpolate) {
    var note = $interpolate('/api/note/{{id}}');

    return {
        list: list,
        create: create,
        createMetric: createMetric,
        destroy: destroy,
        update: update
    };

    function list() {
        return $http.get(note());
    }

    function create(title, text) {
        var data = {
            title: title,
            text: text
        };

<<<<<<< HEAD
    function createMetric(title, text) {
        return $http.post('/api/note/metrics/', { title: title, text: text });
=======
        return $http.post(note(), data);
>>>>>>> f4a54a68201c631610fc1d6b2a7351c0b4c45d51
    }

    function destroy(id) {
        return $http.delete(note({ id: id }));
    }

    function update(id, title, text) {
        var data = {
            title: title,
            text: text
        };

        return $http.put(note({ id: id }), data);
    }
}