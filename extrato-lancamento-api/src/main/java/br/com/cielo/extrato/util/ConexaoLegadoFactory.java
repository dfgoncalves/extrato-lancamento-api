package br.com.cielo.extrato.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.com.cielo.extrato.domain.ExtratoLancamentoLegado;
import br.com.cielo.extrato.exception.Http500Exception;

import com.google.gson.Gson;

public class ConexaoLegadoFactory {

	public static final String SISTEMA_LEGADO = "src/main/resources/lancamento-conta-legado.json";

	public static ExtratoLancamentoLegado getConexao() throws Http500Exception {
		ExtratoLancamentoLegado lancamentos = null;
		try {
			Gson gson = new Gson();
			BufferedReader json = new BufferedReader(new FileReader(SISTEMA_LEGADO));
			lancamentos = gson.fromJson(json, ExtratoLancamentoLegado.class);
			return lancamentos;
		} catch (IOException e) {
			throw new Http500Exception("Serviço temporariamente indisponível.");
		}
	}
}
