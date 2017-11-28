package br.com.cielo.extrato.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.domain.ContaCorrente;
import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.domain.legacy.ControleLancamentoLegacy;
import br.com.cielo.extrato.exception.Http500Exception;
import br.com.cielo.extrato.mapping.LancamentoMapping;
import br.com.cielo.extrato.proxy.LegacyProxy;
import br.com.cielo.extrato.service.ExtratoLancamentoService;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
@Service
public class ExtratoLancamentoServiceImpl implements ExtratoLancamentoService {

	@Autowired
	private LegacyProxy legacyProxy;


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<List<Lancamento>> getAllExtracts() {
		try {
			return LancamentoMapping.from(legacyProxy.getAllExtracts());
		} catch (Http500Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<List<Lancamento>> getExtractByContaCorrente(ContaCorrente contaCorrente) {
		try {
			List<ControleLancamentoLegacy> lancamentosLegadoById = filterByContaCorrente(legacyProxy.getAllExtracts(), contaCorrente);
			return LancamentoMapping.from(lancamentosLegadoById);
		} catch (Http500Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}

	/**
	 * 
	 * @param allExtracts
	 * @param contaCorrente
	 * @return
	 */
	private List<ControleLancamentoLegacy> filterByContaCorrente(List<ControleLancamentoLegacy> allExtracts, ContaCorrente contaCorrente) {
		List<ControleLancamentoLegacy> lancamentosLegacy = new ArrayList<ControleLancamentoLegacy>();
		for(int i=0; i<allExtracts.size(); i++){
			int banco = allExtracts.get(i).getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getCodigoBanco();
			int agencia = allExtracts.get(i).getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia();
			long conta = allExtracts.get(i).getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente();
			ContaCorrente contaLegacy = new ContaCorrente(banco, agencia, conta);
			if(contaLegacy.equals(contaCorrente)){
				lancamentosLegacy.add(allExtracts.get(i));
			}
		}
		return lancamentosLegacy;
	}
}
