package br.com.estudo;

// declarando a enum com as constantes do menu de opções
enum Opcoes {

	INSERIR(1), ALTERAR(2), DELETAR(3), VISUALIZAR(4);

	int intValor;

	Opcoes(int valor) {
		this.intValor = valor;
	}

	int getValor() {
		return intValor;
	}
}

// classe aninhada para teste do menu
public class MenuOpcoesUsandoEnum {

	public static void main(String[] args) {

		// chamada ao metodo selecionarOpcao(),
		// passando as constantes da enum como parâmetro
		selecionarOpcao(Opcoes.VISUALIZAR);
		selecionarOpcao(Opcoes.ALTERAR);
		selecionarOpcao(Opcoes.DELETAR);
		selecionarOpcao(Opcoes.INSERIR);

	}

	// metodo que cria o menu de opções
	private static void selecionarOpcao(Opcoes opcao) {

		switch (opcao) {

		case VISUALIZAR:
			System.out.println("\nMostrando");
			break;
		case INSERIR:
			System.out.println("\nInserindo");
			break;
		case ALTERAR:
			System.out.println("\nAlterando");
			break;
		case DELETAR:
			System.out.println("\nDeletando");
			break;

		}

	}

}
