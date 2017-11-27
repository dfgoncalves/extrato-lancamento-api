package br.com.cielo.extrato.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import br.com.cielo.extrato.domain.ControleLancamento;
import br.com.cielo.extrato.domain.ExtratoLancamentoLegado;
import br.com.cielo.extrato.exception.Http500Exception;

@Repository
public class LegacyConnectionFactory {

	private static final String LEGACY_SYSTEM = "src/main/resources/lancamento-conta-legado.json";
	private ExtratoLancamentoLegado lancamentos = null;

	private LegacyConnectionFactory() throws Http500Exception {
		try {
			BufferedReader json = new BufferedReader(new FileReader(LEGACY_SYSTEM));
			this.lancamentos = new Gson().fromJson(json, ExtratoLancamentoLegado.class);
		} catch (IOException e) {
			throw new Http500Exception("Serviço temporariamente indisponível.");
		}
	};

	public List<ControleLancamento> getAllExtracts() throws Http500Exception {
		if (lancamentos == null) {
			//TODO Testar Factory
			new LegacyConnectionFactory();
		}
		return this.lancamentos.getListaControleLancamento();
	}

}
