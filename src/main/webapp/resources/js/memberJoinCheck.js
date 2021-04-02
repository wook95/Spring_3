



	let all = document.getElementById("all");
	let agreeBox = document.getElementsByClassName("agreeBox1");
	const btn = document.getElementById("btn");

function check(){
	
	let result = true;
	for(let ag of agreeBox){
		
		if(!ag.checked){
			result=false;
			break;
		}
	}
	
	all.checked=result;
	

	

}
	

	for(let ag of agreeBox){
	all.addEventListener("click",function(){
		
		
	ag.checked = all.checked;
	
	})

	}
	
	btn.addEventListener("click", function(){
		
		
		if(all.checked){
			location.href="./memberJoin"; //get 방식
		}
		else{
			alert("약관동의 필수 ! ! !");
		}
		
	})
	
	
