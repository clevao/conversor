package com.cleverson.conversor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cleverson.conversor.model.Conversao;
import com.cleverson.conversor.service.ConversorService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ConversorController {
	
	@Autowired
	ConversorService conversorService;
	
	@RequestMapping(value = "/m2cm/{valor}", method = RequestMethod.GET)
	public Conversao metro2Cm(@PathVariable(value = "valor") Double valor) {
		return conversorService.converterMetro2Cm(valor);
	}
	
	@RequestMapping(value = "/cm2m/{valor}", method = RequestMethod.GET)
	public Conversao cm2M(@PathVariable(value = "valor") Double valor) {
		return conversorService.converterCm2Metro(valor);
	}
	
}
