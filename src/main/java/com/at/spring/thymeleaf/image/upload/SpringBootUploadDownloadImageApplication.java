package com.at.spring.thymeleaf.image.upload;

import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.at.spring.thymeleaf.image.upload.service.FilesStorageService;

@SpringBootApplication
public class SpringBootUploadDownloadImageApplication implements CommandLineRunner {

  @Resource
  FilesStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootUploadDownloadImageApplication.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
//    storageService.deleteAll();
    storageService.init();
  }
}
