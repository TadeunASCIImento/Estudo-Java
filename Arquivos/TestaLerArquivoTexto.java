package br.com.estudo;

public class TestaLerArquivoTexto {

	public static void main(String[] args) {

		LerArquivoTexto app = new LerArquivoTexto();
		app.abrirArquivo();
		app.mostrarContato();
		app.fecharArquivo();

	}
}
