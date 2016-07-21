
resume.service('httpService',['$http',function($http){
	
	this.get = function(url, callback){
	      $http.get(url).success(callback);
	}
	
	
	this.post = function(url, data, callback){
		$http({
			method:'post',
			data:data
		}).then(callback);
	}
	
	
}]);