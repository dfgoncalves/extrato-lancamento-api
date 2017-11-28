package br.com.cielo.extrato.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.cielo.extrato.domain.ContaCorrente;
import br.com.cielo.extrato.domain.Lancamento;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public interface ExtratoLancamentoService {

	/**
	 * 
	 * @return Todos os lançamentos de conta corrente
	 */
	ResponseEntity<List<Lancamento>> getAllExtracts();
	
	/**
	 * 
	 * @param contaCorrente
	 * @return
	 */
	ResponseEntity<List<Lancamento>> getExtractByContaCorrente(ContaCorrente contaCorrente);
	
	
}
