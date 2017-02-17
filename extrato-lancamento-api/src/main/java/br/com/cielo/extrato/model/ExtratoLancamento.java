package br.com.cielo.extrato.model;

import java.util.List;

import br.com.cielo.extrato.exception.Http404Exception;
import br.com.cielo.extrato.exception.Http500Exception;

public interface ExtratoLancamento {
	public List<Lancamento> listarLancamentos() throws Http500Exception, Http404Exception;
}
