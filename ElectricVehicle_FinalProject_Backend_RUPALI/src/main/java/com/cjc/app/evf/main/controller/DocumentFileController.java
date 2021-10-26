package com.cjc.app.evf.main.controller;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.evf.main.model.DocumentDetails;
import com.cjc.app.evf.main.service_Interface.EvfServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/file")
public class DocumentFileController {
	
	@Autowired
	EvfServiceI es;
	
	// Step 1: Define a location 
		public static final String DIRECTORY="C:\\Users\\Daksha\\Desktop\\SpringBootSTS\\ElectricVehicle_FinalProject_Backend\\src\\main\\CustomerData";
		
		
		// Step 2: Define a method to upload files
		@PostMapping("/upload")
		public ResponseEntity<List<String>> uploadfiles(@RequestParam("files") List<MultipartFile> multipartfiles ,@RequestParam("doc") String dc) throws IOException {
			
			ObjectMapper obj = new ObjectMapper();
			
			DocumentDetails value = obj.readValue(dc, DocumentDetails.class);
			
			List<String> filenames= new ArrayList<String>();
			
			
			System.out.println(multipartfiles.size());
			
			for(int i=0;i<multipartfiles.size();i++) {
				if(i==0) {  // For Address Proof ;
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getAddressProof());
					

					
					String newFilename=value.getAddressProof()+filename;
					value.setAddressProof(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}else if(i==1) {  // For Bank Statements
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getBankStatement());
					String newFilename=value.getBankStatement()+filename;
					value.setBankStatement(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}else if(i==2) {  // for ITR 
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getiTR());
					
					String newFilename=value.getiTR()+filename;
					value.setiTR(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}else if(i==3) {  // For Photo
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getPhoto());
					String newFilename=value.getPhoto()+filename;
					value.setPhoto(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
				else if(i==4) {   // For blankCheck
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getBlankCheck());
					String newFilename=value.getBlankCheck()+filename;
					value.setBlankCheck(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
				else if(i==5) {  // For Thumb 
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getThumb());
					String newFilename=value.getThumb()+filename;
					value.setThumb(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
				else if(i==6) {  // salarySlip
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getSalarySlip());
					String newFilename=value.getSalarySlip()+filename;
					value.setSalarySlip(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
				else if(i==7) {  // signature
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getSignature());
					String newFilename=value.getSignature()+filename;
					value.setSignature(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
				else if(i==8) {  // aadharCard
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getAadharCard());
					String newFilename=value.getAadharCard()+filename;
					value.setAadharCard(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}else if(i==9) {  // panCard
					MultipartFile file = multipartfiles.get(i);
					String filename = StringUtils.cleanPath(file.getOriginalFilename());
					System.out.println(value.getPanCard());
					String newFilename=value.getPanCard()+filename;
					value.setPanCard(newFilename);
					Path fileStorage = Paths.get(DIRECTORY, newFilename).toAbsolutePath().normalize(); 
					Files.copy(file.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
					filenames.add(newFilename);
				}
			}
			
			
			es.saveDoucments(value);			
			return ResponseEntity.ok(filenames);
			
			
			
		}
		
		// Step 3: Define  a method to download files
		@GetMapping("/download/{filename}")
		public ResponseEntity<Resource> downloadfiles(@PathVariable("filename") String filename ) throws IOException{
			
			
			Path filepath = Paths.get(DIRECTORY).toAbsolutePath().normalize().resolve(filename);
			if(!Files.exists(filepath)) {
				throw new FileNotFoundException(filename + " was not found on server");
			}
			Resource resource = new UrlResource(filepath.toUri());
			System.out.println(filepath.toUri());
			System.out.println(filepath);
			System.out.println(resource);
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("File-Name", filename);
			httpHeaders.add(httpHeaders.CONTENT_DISPOSITION, "attachment; File-Name = " + resource.getFilename());
			
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filepath))).headers(httpHeaders).body(resource);
		} 
		

}
