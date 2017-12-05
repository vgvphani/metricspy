 // function infoService($http, $interpolate) {
 //
 //     var metric = $interpolate("/api/metric/graphs" + hostname);
 //
 //     return {
 //         list: list
 //     };
 //
 //     function list() {
 //         return $http.get(metric(hostname));
 //     }
 // }

    function infoService($http) {

    return {
        list: list
    };

    function list(hostname) {
        return $http.get("/api/metric/graphs/" + hostname);
    }
}