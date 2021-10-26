package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.helperclass.FileUploadHelperClass;

@RestController
public class FileUploadController {

	@Autowired
	FileUploadHelperClass fileUploadHelper;

	@PostMapping("/upload_image")
	public ResponseEntity<String> uploadFile(@RequestParam("upload_file") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getSize());

		try {
			// Validations
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain some file!!");
			}

//			if (!file.getContentType().equals("images/jpeg")) {
//
//				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//						.body("only jpeg content are allowed  here!!");
//
//			}

			boolean f = fileUploadHelper.uploadFile(file);
			if (f) {
//				return ResponseEntity.ok("File Uploaded Successfully!!");
				
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("Something went wrong , Please try again later!!");
	}

}
