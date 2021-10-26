package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.helperClass.ImageUpload;
import com.example.massage.ResponseMassage;
import com.example.model.Faculty;
import com.example.repository.FacultyInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class FacultyController {

	@Autowired
	FacultyInterface facultyInterface;
	
	Faculty savedfaculty;
	List dataList=new ArrayList();
	Boolean isSuccess;
	static List<String> errors = new ArrayList<String>();
	String msg;
	
	@SuppressWarnings("unchecked")
	@PostMapping("/add")
	public Faculty CreateFaculty(@RequestParam(value="file") MultipartFile file, @RequestParam(value="facultyData") String userData) throws Exception{
		System.out.println(userData);
		ObjectMapper objm = new ObjectMapper();
		Faculty faculty = objm.readValue(userData, Faculty.class);
		System.out.println(faculty);
		String imagedbpath="";
		System.out.println(faculty);
		System.out.println(file.getOriginalFilename());
		
		try {
			
			String filename = file.getOriginalFilename();
			String modifiedName=FilenameUtils.getBaseName(filename)+"_"+System.currentTimeMillis()+"."+FilenameUtils.getExtension(filename);
			boolean value= ImageUpload.uploadFile(file,modifiedName);
			if(value) {
				System.out.println("Image uploaded on server");
				imagedbpath=ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(modifiedName).toUriString();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		faculty.setImage(imagedbpath);
		this.isSuccess=true;
		this.msg="Not Error";
		errors.clear();
		errors.add(0,msg);
	Faculty fac = facultyInterface.save(faculty);
		
		return fac;
	}
}
