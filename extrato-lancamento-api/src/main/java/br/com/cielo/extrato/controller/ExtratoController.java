package br.com.cielo.extrato.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.exception.Http404Exception;
import br.com.cielo.extrato.exception.Http500Exception;
import br.com.cielo.extrato.model.ExtratoLancamento;
import br.com.cielo.extrato.model.ExtratoLancamentoContaCorrente;
import br.com.cielo.extrato.model.Lancamento;

@CrossOrigin
@RestController
public class ExtratoController {
	
	@RequestMapping(value = "/extrato/banco/{idBanco}/agencia/{idAgencia}/conta/{idConta}", method=RequestMethod.GET)
	public ResponseEntity<List<Lancamento>> recuperarExtratoLancamentos(@PathVariable int idBanco, @PathVariable int idAgencia, @PathVariable String idConta, Model model){
		try{
			ExtratoLancamento extratoLancamento = new ExtratoLancamentoContaCorrente(idBanco, idAgencia, idConta);
			List<Lancamento> lancamento = extratoLancamento.listarLancamentos();
			return new ResponseEntity<List<Lancamento>> (lancamento, HttpStatus.OK);
			
		} catch(Http404Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} catch (Http500Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
	}
}
