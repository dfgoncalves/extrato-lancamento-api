package br.com.cielo.extrato.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.domain.ContaCorrente;
import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.service.ExtratoLancamentoService;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/extratos")
public class ExtratoResource {
	
	@Autowired
	private ExtratoLancamentoService extratoService;

	/**
	 * 
	 * @return Todos os lançamentos de conta corrente
	 */
	@RequestMapping(method=RequestMethod.GET)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Lancamento>> getAllExtracts(){
		return extratoService.getAllExtracts();
	}
	
	/**
	 * 
	 * @param banco
	 * @param agencia
	 * @param conta
	 * @return
	 */
	@GET
	@RequestMapping(value="/banco/{banco}/agencia/{agencia}/conta/{conta}", method=RequestMethod.GET)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Lancamento>> getExtractById(@PathVariable("banco") int banco, @PathVariable("agencia") int agencia, @PathVariable("conta") long conta){
		return extratoService.getExtractByContaCorrente(new ContaCorrente(banco, agencia, conta));
	}

}
