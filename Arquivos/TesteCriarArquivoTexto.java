package br.com.estudo;

public class TesteCriarArquivoTexto {

	public static void main(String[] args) {

		CriarArquivoTexto app = new CriarArquivoTexto();
		app.abrirArquivo();
		app.inserirContato();
		app.fecharArquivo();

	}

}
