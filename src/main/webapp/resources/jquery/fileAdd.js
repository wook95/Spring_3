


	//최대 5개까지 안보이던거 추가하기 ,,, sample에 있던걸 files로 id/



	let htm = $("#sample").html();
	

	let i=$("#files").attr("title");
	
	
	
	$("#add").click(function() {

		if (i < 5) {
			$("#files").append(htm);
			i++;
		} else {
			alert("파일은 5개 까지만 ^^~");

		}

	});

	/* 	$("#inputGroupFileAddon04").click(function(){
	 alert("delete~!~~!");
	 $("#files").remove();
	 });  	직접 자식한테 거는게 아니라 부모한테 걸어야  된다..!	*/

	//이벤트 위임
	$("#files").on("click", ".delete", function() {
		$(this).parent().remove();
		i--;

	});