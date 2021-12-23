package com.canermastan.website.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class HomeController {

    @GetMapping("/pdf")
    public String showPdf(){
        return "pdf";
    }

    @GetMapping("/showpdf")
    public ResponseEntity<InputStreamResource> displayPdf() throws IOException {
        String fileName = "static/database.pdf";
        //File file = new ClassPathResource(fileName).getFile();
        InputStream inputStream = new ClassPathResource(fileName).getInputStream();
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "inline;filename=" +fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(String.valueOf(inputStream)));

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.parseMediaType("application/pdf"))
                .body(resource);
    }
}
