package br.com.cielo.extrato.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.exception.Http500Exception;
import br.com.cielo.extrato.mapping.LancamentoMapping;
import br.com.cielo.extrato.service.ExtratoLancamentoService;
import br.com.cielo.extrato.util.LegacyConnectionFactory;

@Service
public class ExtratoLancamentoServiceImpl implements ExtratoLancamentoService {

	@Autowired
	private LegacyConnectionFactory legacyConnection;

	public ResponseEntity<List<Lancamento>> getAllExtracts() {
		try {
			return LancamentoMapping.from(legacyConnection.getAllExtracts());
		} catch (Http500Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}

	public Lancamento getExtractById() {
		// TODO Auto-generated method stub
		return null;
	}

}
