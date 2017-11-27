package br.com.cielo.extrato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.dao.ExtratoLancamentoDAO;
import br.com.cielo.extrato.domain.Lancamento;

@Service
public class ExtratoLancamentoServiceImpl implements ExtratoLancamentoService{

	@Autowired
	private ExtratoLancamentoDAO extratoDAO;
	
	public List<Lancamento> getAllExtracts() {
//		ExtratoLancamento extratoLancamento = new ExtratoLancamentoContaCorrente(idBanco, idAgencia, idConta);
//		List<Lancamento> lancamento = extratoLancamento.listarLancamentos();
//		return lancamento;
		
		
//		try{
//		ExtratoLancamento extratoLancamento = new ExtratoLancamentoContaCorrente(idBanco, idAgencia, idConta);
//		List<Lancamento> lancamento = extratoLancamento.listarLancamentos();
//		return new ResponseEntity<List<Lancamento>> (lancamento, HttpStatus.OK);
//		
//	} catch(Http404Exception e){
//		return new ResponseEntity<List<Lancamento>>(HttpStatus.NOT_FOUND);
//		
//	} catch (Http500Exception e){
//		return new ResponseEntity<List<Lancamento>>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
		return null;
	}

	public Lancamento getExtractById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
