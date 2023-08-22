package com.example.day2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
@Value("${studentName}")
private String studentName;
@GetMapping("affrin")
public String getName()
{
	return "Name is: "+studentName;
}
}
