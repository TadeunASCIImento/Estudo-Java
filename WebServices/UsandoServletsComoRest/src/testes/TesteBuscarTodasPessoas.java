package br.com.testes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.entities.Pessoa;
import br.com.repositories.PessoaRepository;

class TesteBuscarTodasPessoas {

	@Test
	void testaBuscarTodasAsPessoasNoBanco() {
		try {
			List<Pessoa> lista = (List<Pessoa>) new PessoaRepository().findAll();
			assertEquals("Tadeu", lista.get(0).getNome());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
