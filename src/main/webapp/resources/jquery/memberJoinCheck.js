// agreeBox - 전체동의 id //agreeBox1 각각의 동의들

$("#all").click(function(){
	
	
	let check = $("#all").prop("checked");
	$(".agreeBox1").prop("checked",check);	
	
	
});

$(".agreeBox1").click(function(){
	
	let result = true;
	
	$(".agreeBox1").each(function(){
		
		if(!$(this).prop("checked")){
			
			result =  false;
		}
		
		
	});
	
	$("#all").prop("checked",result);
	
		
});

$("#btn").click(function(){
	
	
	let result = $("#all").prop("checked");
	if(result){
		location.href="./memberJoin";
	}else{
		alert("약관동의바람");
	}
	
});
