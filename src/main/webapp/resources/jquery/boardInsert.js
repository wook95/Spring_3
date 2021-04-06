

$("#btn").click(function(){
	

//let writer = $("#writer").val() != "";
//let title = $("#title").val() != "";
//let contents= $("#contents").val() !="";


	let result = ture;

	let myCheck = $(".myCheck").each(function(s1,s2){
		
		console.log(s1);
		console.log($(s2).val());
		console.log($("this").val());
		if($(this).valuue==""){
			result = false;}

	});

	
	
	
	if(writer && title && contents){
	$("#frm").submit();}
	else{
		alert("빈칸이 있으면 안돼!");
	}
	
	
	
	
});