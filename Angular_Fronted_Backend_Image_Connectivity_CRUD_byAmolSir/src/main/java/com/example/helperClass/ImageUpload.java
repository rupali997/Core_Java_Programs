package com.example.helperClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ImageUpload {

	public static boolean uploadFile(MultipartFile file,String modifiedfile)throws IOException {
		String Image_Dir="C:\\Users\\Daksha\\Desktop\\SpringBootSTS\\Angular_Fronted_Backend_Image_Connectivity_CRUD_byAmolSir\\src\\main\\resources\\static\\images";
		
		boolean f = false;
		try {
			
			Files.copy(file.getInputStream(), Paths.get(Image_Dir+File.separator+modifiedfile),StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}
