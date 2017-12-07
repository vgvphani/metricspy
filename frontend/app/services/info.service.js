function infoService($http) {

    return {
        list: list
    };

    function list(hostname) {
        return $http.get("/api/metric/graphs/" + hostname);
    }
}