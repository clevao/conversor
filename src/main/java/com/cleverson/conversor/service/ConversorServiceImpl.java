package com.cleverson.conversor.service;

import org.springframework.stereotype.Service;

import com.cleverson.conversor.model.Conversao;

@Service
public class ConversorServiceImpl implements ConversorService{

	@Override
	public Conversao converterMetro2Cm(Double valor) {
		Conversao c = new Conversao();
		c.setDe("METRO");
		c.setValorDe(valor);
		c.setPara("CENTIMETROS");
		c.setValorConvertido(valor * 100);
		return c;
	}

	@Override
	public Conversao converterCm2Metro(Double valor) {
		Conversao c = new Conversao();
		c.setDe("CENTIMETROS");
		c.setValorDe(valor);
		c.setPara("METRO");
		c.setValorConvertido(valor / 100);
		return c;
	}
	
}
