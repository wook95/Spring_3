









let num = $("#comments").attr("title")
//el 못 쓰니깐


getList();

function getList(){
$.get("../comments/commentsList?num="+num,function(data){
	$("#comments").html(data.trim());
	
});
}




//$("#remove").click(function(){
	//없는 상태에서 걸어주면 안된다,, 페이지 다 불러오고 리스트 불러와서 ,, 이벤트위임 써야댐
	
	$("#comments").on("click","#remove",function(){
		
		const ar = []; // 빈 배열 선언했다 - 체크 되어있는걸 저장하기 위함
		$(".del").each(function(){
			
			
		let ch = $(this).prop("checked");
		if(ch){
			ar.push($(this).val());
			
		}
			
			
		}); //end of each
		
		
		$.ajax({
			type : "POST",
			url : "../comments/commentsDelete",
			data : {commentsNum:ar},
			traditiondal : true, //배열 보내고 싶을때 ,,
			success:function(data){
				
				alert(data);
				
			}
			
			
		})
	


		
	});  //end of function
	
	



$("#writeButton").click(function(){
	
	alert("버튼 눌름");
	
	let writer = $("#writer").val();
	let contents= $("#contents").val();
	
	$.post("../comments/commentsInsert",{
		num : num,
		writer:writer,
		contents: contents},
	
	function(data){
		console.log(data);
		data=data.trim();
		console.log(data);
		if(data==1){
			alert("등록 성공");
			$("#writer").val('');
			$("#contents").val('');
			getList();
			
		}else{
				alert("등록 실패");
		}
		
		
		
		
	});
	
	
});