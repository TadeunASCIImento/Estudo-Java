package br.com.estudo;

public class CriarArquivoSequencialTeste {

	public static void main(String[] args) {

		CriaArquivoSequencial app = new CriaArquivoSequencial();
		app.abrirArqiuvo();
		app.inserirContato();
		app.fecharArquivo();

	}
}
