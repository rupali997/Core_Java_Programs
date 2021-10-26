package com.example.helperclass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelperClass {

	// it for static url
//	public final String Upload_Img_Dir = "C:\\Users\\Daksha\\Desktop\\SpringBootSTS\\Angular_Backend_Project_for_FileUploading_byCodeWithDurgesh\\src\\main\\resources\\static\\images";

	// dynamic url, it means it also served on server
	public final String Upload_Img_Dir = new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public  FileUploadHelperClass() throws IOException {}
	
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f = false;

		try {

			Files.copy(multipartFile.getInputStream(),
					Paths.get(Upload_Img_Dir + File.separator + multipartFile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
