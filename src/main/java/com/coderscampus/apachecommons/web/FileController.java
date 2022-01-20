package com.coderscampus.apachecommons.web;

import java.io.IOException;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.apachecommons.service.FileService;

@RestController
public class FileController {
	@Autowired
	private FileService fileService;

	@GetMapping("/all-recipes")
	public Iterable<CSVRecord> fileLines() throws IOException {

		return fileService.readFile("data.txt");
	}
}
