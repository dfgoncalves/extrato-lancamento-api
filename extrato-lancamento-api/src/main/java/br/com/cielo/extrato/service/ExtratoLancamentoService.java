package br.com.cielo.extrato.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.cielo.extrato.domain.Lancamento;

public interface ExtratoLancamentoService {

	public abstract ResponseEntity<List<Lancamento>> getAllExtracts();
	
	public abstract Lancamento getExtractById();
	
	
}
