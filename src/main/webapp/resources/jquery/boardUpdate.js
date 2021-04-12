


$(".fileDelete").click(function(){
	
	let check = confirm("삭제할거야 정말 ?");
	
	if(check){
	
	let fileNum = $(this).attr("title");
	let obj = $(this);

	//noticeFileDelete
	
	
	
	
	
	$.ajax({
		
		
		
		
		url:"./fileDelete",
		type : "GET",
		data : {fileNum:fileNum},
		success: function(result){
			
			//result를 받아 삭제 된건지 아닌지 알아보려고 !
			
			result=result.trim();
			
			
			if(result>0){
				alert("삭제 성공");
				$(obj).parent().remove();
				i--;
			}else{
				alert("삭제 실패");
			}
			
		}
			
			
			
	
			
			
}) //end of ajax

} //end of if



})