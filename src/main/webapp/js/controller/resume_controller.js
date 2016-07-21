

/*console.info("asdfafsd");
		                              var resume = angular.module('resume',[]);*/
var user_id = "1"

//基础信息
resume.controller('BasicInfoController', ['$rootScope','$scope', 'httpService', 
           function($rootScope, $scope, httpService){
	
	    $scope.basicInfo = {}
	    var basicInfoUrl = "/zender/restful/user/get/" + user_id;
	    httpService.get(basicInfoUrl, function(response){
	    	$scope.basicInfo = response;
	    });
}]);


//工作经历
resume.controller('EmploymentController', ['$rootScope','$scope','httpService',
         function($rootScope,$scope,httpService){
	   $scope.employments = []
	   var employmentsUrl = "/zender/restful/resume/employment/" + user_id;
	   httpService.get(employmentsUrl, function(response){
	    	$scope.employments = response;
	    	console.info($scope.employments.length)
	   });
}]);

//职业技能
resume.controller('SkillController', ['$rootScope','$scope','httpService',
                                           function($rootScope,$scope,httpService){
      	   $scope.skills = []
      	   var skillsUrl = "/zender/restful/resume/skill/" + user_id;
      	   httpService.get(skillsUrl, function(response){
      	    	$scope.skills = response;
      	    	console.info($scope.skills.length)
      	   });
 }]);

//教育经历
resume.controller('EducationController', ['$rootScope','$scope','httpService',
                                           function($rootScope,$scope,httpService){
      	   $scope.educations = []
      	   var educationsUrl = "/zender/restful/resume/education/" + user_id;
      	   httpService.get(educationsUrl, function(response){
      	    	$scope.educations = response;
      	    	console.info($scope.educations.length)
      	   });
 }]);