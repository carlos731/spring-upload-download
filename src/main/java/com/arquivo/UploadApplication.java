package com.arquivo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arquivo.service.FileService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class UploadApplication implements CommandLineRunner{

	@Resource
	FileService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(UploadApplication.class, args);
	}

	  @Override
	  public void run(String... arg) throws Exception {
//	    storageService.deleteAll();
	    storageService.init();
	  }
}
