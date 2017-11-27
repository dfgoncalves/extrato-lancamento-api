package br.com.cielo.extrato.service;

import java.util.List;

import br.com.cielo.extrato.domain.Lancamento;

public interface ExtratoLancamentoService {

	public abstract List<Lancamento> getAllExtracts();
	
	public abstract Lancamento getExtractById();
	
	
}
