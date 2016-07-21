

app.run(['$rootScope','$state','$stateParams', '$cookieStore', 
             function($rootScope, $state, $stateParams, $cookieStore){
	
    	//将状态绑定到根Scope，方便访问
	    $rootScope.$state = $state;
    	$rootScope.$stateParams = $stateParams;
    	
    	$rootScope.$on('$stateChangeStart', function(event, toState, toParams, fromState, fromParams){
    		   if(toState.name = "login")
    			   return;
    		   $rootScope.userInfo = $cookieStore.get("userInfo");
    		   if(!$rootScope.userInfo){
    			   event.preventDefault();
    			   //跳转到登录页面	
    			   $state.go("login")
    		   }
    	 });
}]);