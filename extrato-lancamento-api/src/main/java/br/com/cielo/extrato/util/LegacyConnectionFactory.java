package br.com.cielo.extrato.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import br.com.cielo.extrato.domain.legacy.ControleLancamentoLegacy;
import br.com.cielo.extrato.domain.legacy.ExtratoLancamentoLegacy;
import br.com.cielo.extrato.exception.Http500Exception;

@Repository
public class LegacyConnectionFactory {

	private static final String LEGACY_SYSTEM = "src/main/resources/lancamento-conta-legado.json";
	private ExtratoLancamentoLegacy lancamentos = null;

	private LegacyConnectionFactory() throws Http500Exception {
		try {
			BufferedReader json = new BufferedReader(new FileReader(LEGACY_SYSTEM));
			this.lancamentos = new Gson().fromJson(json, ExtratoLancamentoLegacy.class);
		} catch (IOException e) {
			throw new Http500Exception("Servi�o temporariamente indispon�vel.");
		}
	};

	public List<ControleLancamentoLegacy> getAllExtracts() throws Http500Exception {
		if (lancamentos == null) {
			//TODO Testar Factory
			System.out.println("Criou a lista de lancamentos do legado");
			new LegacyConnectionFactory();
		}
		return this.lancamentos.getListaControleLancamento();
	}

}
