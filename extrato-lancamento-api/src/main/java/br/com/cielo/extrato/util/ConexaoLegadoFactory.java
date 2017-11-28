package br.com.cielo.extrato.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import br.com.cielo.extrato.domain.legacy.ExtratoLancamentoLegacy;
import br.com.cielo.extrato.exception.Http500Exception;

public class ConexaoLegadoFactory {

	public static final String SISTEMA_LEGADO = "src/main/resources/lancamento-conta-legado.json";

	public static ExtratoLancamentoLegacy getConexao() throws Http500Exception {
		ExtratoLancamentoLegacy lancamentos = null;
		try {
			Gson gson = new Gson();
			BufferedReader json = new BufferedReader(new FileReader(SISTEMA_LEGADO));
			lancamentos = gson.fromJson(json, ExtratoLancamentoLegacy.class);
			return lancamentos;
		} catch (IOException e) {
			throw new Http500Exception("Servi�o temporariamente indispon�vel.");
		}
	}
}
