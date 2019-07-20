package br.com.estudo;

public class LerArquivoSequencialTeste {

	public static void main(String[] args) {

		LerArquivoSequencial app = new LerArquivoSequencial();

		app.abrirArquivo();
		app.lerContato();
		app.fecharArquivo();
	}
}
