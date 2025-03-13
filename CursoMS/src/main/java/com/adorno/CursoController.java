package com.adorno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.client.StudentClient;

@RestController
@RequestMapping("curso")
public class CursoController {
	
	@Autowired
	private StudentClient studentClient;
	
	@GetMapping("uno")
	public String getCosas() {
		return studentClient.getEstudiante().getBody()+"soy un curso";
	}
}
