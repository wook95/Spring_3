package com.arc.s3.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	
	
	public File makePath(HttpSession httpSession) throws Exception{
		
		
		//1. 저장할 디렉토리 지정	-	resources/upload/member
		//2. os에서 인식할 수 있는 실제 경로 찾아와야한다 (루트가 각각 다를지도,, 여기선 루트 s3 컴에서는 C://)
		// jsp : application == server : ServletContext
		String path = httpSession.getServletContext().getRealPath("resources/upload/member");
		//실제 운영체제에서 쓰는 경로 알려조~!
		System.out.println(path);
				
				
		//3. 실제 경로에 폴더가 없으면 파일 저장시 에러 발생 --> 없으면 만들어주자!
				File file = new File(path);
				
				if(!file.exists()) {
					
					file.mkdirs();
					
				}
			
		return file;
		
	}
	
	
	//랜덤 이름 만드는법2가지
	public String makeTimeFileName() throws Exception{
		
		
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
			
		return String.valueOf(time);
		
	}
	
	public String makeUUIDFileName() throws Exception{
		
		return UUID.randomUUID().toString();
	}
	
	
	
	//저장방법 2가지
	
	public void saveUseCopy(MultipartFile multipartFile, File file) throws Exception{
		
		FileCopyUtils.copy(multipartFile.getBytes(), file);
							// 이진데이터,            //이런 이름
	}
	
	public void saveUseTransfer(MultipartFile multipartFile, File file)throws Exception{
		multipartFile.transferTo(file);
		
	}
	
	
	
	
	public String save(String name,MultipartFile multipartFile, HttpSession httpSession) throws Exception{
		
		//1. 경로 설정
		String path = httpSession.getServletContext().getRealPath("resources/upload/"+name);
		System.out.println(path);
		
		
		File file = new File(path);
		//폴더나 파일의 정보 담고있다, 정보 and 경로
		
		if(!file.exists()) {
			
			file.mkdirs();
			//경로가 없다면 mkdirs메소드로 경로 만들어줌
		}
		
		//2. 저장할 파일명
		String fileName="";
	//	Calendar ca = Calendar.getInstance();
	//	long time = ca.getTimeInMillis();
	//	fileName = time+"_"+multipartFile.getOriginalFilename();
		
		fileName = UUID.randomUUID().toString() + "_" + multipartFile.getOriginalFilename();
		//중복되지 않게 파일명 만들어준다
		
		//3. hdd 에 저장
		
		file = new File(file,fileName);
		//FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		multipartFile.transferTo(file);
		
		return fileName;
	}
	
	
	
	
	
	
	
}
