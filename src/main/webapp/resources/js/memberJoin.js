



let btn = document.getElementById("btn");
let id = document.getElementById("id");
let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");
let idResult = document.getElementById("idResult");
let pwResult = document.getElementById("pwResult");
let pw2Result= document.getElementById("pw2Result");






id.addEventListener("blur",function(){
	
	if(id.value.length<6){
		
		idResult.innerHTML = "6글자 ,, 이상 ,,, 부탁 ,,,6";
		idResult.style.color = "red";
	}
	
	else{
		idResult.innerHTML = "";
		
	}
	
	
});

pw.addEventListener("blur",function(){
	
	if(pw.value.length<8){
		
		pwResult.innerHTML = "8글자 ,, 이상 ,,, 부탁 ,,,";
		pwResult.style.color = "red";
	}
	else{
		
		
		pwResult.innerHTML="";
	}
	
	
	
});


pw.addEventListener("change",function(){
	pw2.value="";
	pw2Result.innerHTML = "패스워드를 다시 입력해주세요!";
});


pw2.addEventListener("blur",function(){
	
	if(pw.value != pw2.value){
		
		pw2Result.innerHTML = "패스워드가 다릅니다.";
		
		pw2.value="";
		
		
	}
	
	else{
		
		pw2Result.innerHTML = "";
	}
	
	
	
});




btn.addEventListener("click",function(){
	
	let name = document.getElementById("name");
	let email = document.getElementById("email");
	let phone = document.getElementById("phone");
	let check = true;
	
	if((name.value.length>0)&&(email.value.length>0)&&(phone.value.length>0)&&
	(id.value.length>=6)&&(pw.value.length>=8)&&(pw.value==pw2.value)){
		check=true;
	}else{check = false;}

	
	
	if(check){
	let frm = document.getElementById("frm");
	frm.submit();

	
	}
	else{alert("필수항목을 입력해주세요")}
	
});
