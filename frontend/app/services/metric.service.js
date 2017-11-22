function metricService($http, $interpolate) {
    var metric = $interpolate('/api/metric/{{id}}');

    return {
        list: list
    };

    function list() {
        return $http.get(metric());
    }
}