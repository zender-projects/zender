/**
 * @desc 简历小标题
 * @author zender
 * */
resume.directive('title', function(){
	return {
		restrict:"AE",
		scope:{
			desc:"@"
		},
		template:"<h3 class='clr1'>{{desc}}</h3>"
	}
});