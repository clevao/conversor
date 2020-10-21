package com.cleverson.conversor.service;

import com.cleverson.conversor.model.Conversao;

public interface ConversorService {
	
	public Conversao converterMetro2Cm(Double valor);
	public Conversao converterCm2Metro(Double valor);
	
}
