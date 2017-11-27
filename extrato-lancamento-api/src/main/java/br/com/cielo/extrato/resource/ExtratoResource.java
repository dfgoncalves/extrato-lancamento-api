package br.com.cielo.extrato.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.service.ExtratoLancamentoService;

@CrossOrigin
@RestController
@RequestMapping("/extratos")
public class ExtratoResource {
	
	@Autowired
	private ExtratoLancamentoService extratoService;

	@RequestMapping(method=RequestMethod.GET)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Lancamento>> getAllExtracts(){
		return extratoService.getAllExtracts();
	}
	
	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Lancamento>> getExtract(String id){
//		try{
//			ExtratoLancamento extratoLancamento = new ExtratoLancamentoContaCorrente(idBanco, idAgencia, idConta);
//			List<Lancamento> lancamento = extratoLancamento.listarLancamentos();
//			return new ResponseEntity<List<Lancamento>> (lancamento, HttpStatus.OK);
//			
//		} catch(Http404Exception e){
//			return new ResponseEntity<List<Lancamento>>(HttpStatus.NOT_FOUND);
//			
//		} catch (Http500Exception e){
//			return new ResponseEntity<List<Lancamento>>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		return null;
	}
	
	
	
	
	
	
	
}
