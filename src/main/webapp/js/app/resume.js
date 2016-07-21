

var resume = angular.module('resume',[])
.run(['$rootScope', function($rootScope){
	$rootScope.downloadUrl = "http://localhost:8080/zender/restful/resume/download/1"
    $rootScope.mainUrl = "http://localhost:8080/zender/resume/index.htm"
    $rootScope.contactUrl = "http://localhost:8080/zender/resume/contact.htm"
    $rootScope.mapUrl = "http://localhost:8080/zender/resume/map.htm"
}]);