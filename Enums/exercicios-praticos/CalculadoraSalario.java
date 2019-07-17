package br.com.estudo;

// As classes e a enum foram dispostas em um unico arquivo
// de forma aninhada para facilitar os testes

import java.util.NoSuchElementException;
import java.util.Scanner;

// INICIO DA CLASSE TesteCalcularSalario
class TesteCalcularSalario {

	public static void main(String[] args) {

		CalcularSalario app = new CalcularSalario();
		app.realizarCalculoVencimentos();

	}
}// FIM DA CLASSE TesteCalcularSalario

// INICIO DA CLASSE CalcularSalario
public class CalcularSalario {

	private double salarioBase;
	private double salarioLiquido;
	private double horaExtra;
	private double valorFerias;
	private double qtdHoras50, qtdHoras100;
	// constantes do menu de opções para cálculo
	private static MenuOpcoes tipoOperacao;
	private final static MenuOpcoes[] selecaoOperacao = { MenuOpcoes.PAGAMENTO_FERIAS, MenuOpcoes.PAGAMENTO_MENSAL,
			MenuOpcoes.TERMINAR_SISTEMA };

	static Scanner scanner = new Scanner(System.in);

	// metodo calcula salário liqui do aplicando desconto de 11% sobre o sálario
	// base e chama o metodo calcularHoraExtra().
	public double calcularSalarioLiquido() {

		System.out.println("\n\n\t\tEntre com o salário base?");
		salarioBase = scanner.nextDouble();
		System.out.println("\t\tQuantidade de horas extras 50% realizadas se houver?");
		qtdHoras50 = scanner.nextDouble();
		System.out.println("\t\tQuantidade de horas extras 100% realizadas se houver?");
		qtdHoras100 = scanner.nextDouble();

		// calcula salario total incluindo horas extras
		double salarioCalculado = salarioBase + calcularHoraExtra50PorCento(qtdHoras50)
				+ calcularHoraExtra100PorCento(qtdHoras100);
		System.out.println("\t\tSalário base R$: " + salarioBase);
		System.out.println("\t\tHoras extras calculadas R$: "
				+ (float) (calcularHoraExtra50PorCento(qtdHoras50) + calcularHoraExtra100PorCento(qtdHoras100)));

		System.out.println("\t\tSalário bruto R$: " + (float) salarioCalculado);
		salarioLiquido = salarioCalculado - (salarioCalculado * 0.09);
		System.out.println("\t\tTotal de desconto R$:" + (float) (salarioCalculado - salarioLiquido));
		System.out.println("\t\tSalário liquido R$:" + (float) salarioLiquido);

		return salarioLiquido;
	}

	// calcula horas extras com valor de 50% supondo 220 horas mensais
	private double calcularHoraExtra50PorCento(double qtdHoras) {
		horaExtra = ((salarioBase / 220 * 1.5) * qtdHoras);

		return horaExtra;
	}

	// calcula horas extras com valor de 100% supondo 220 horas mensais
	private double calcularHoraExtra100PorCento(double qtdHoras) {
		horaExtra = ((salarioBase / 220 * 2) * qtdHoras);

		return horaExtra;
	}

	// realiza calculo férias supondo 12 meses trabalhados
	public void calcularFerias() {

		System.out.println("\n\n\t\tEntre com o salário base?");
		salarioBase = scanner.nextDouble();
		double valorFeriasBruto = 0.0;
		valorFeriasBruto = salarioBase * 1.333;

		double descontoINSS = 0.0;
		descontoINSS = valorFeriasBruto * 0.09;
		System.out.println("\t\tDesconto INSS R$: " + descontoINSS);

		double descontoIRPF = 0.0;
		descontoIRPF = ((valorFeriasBruto - descontoINSS) * 0.075 - 142.80);
		System.out.println("\t\tDesconto IRPF R$: " + (float) descontoIRPF);
		valorFerias = (valorFeriasBruto - descontoINSS - descontoIRPF);
		System.out.println("\t\tFérias calculadas R$: " + (float) valorFerias);

	}

	// cria e solicita opções de calculo
	public static MenuOpcoes selecionarOperacao() {

		int opcao = 1;

		try {
			for (;;) {
				System.out.println(
						"\n\t\t\t( Operações )\n( 1 - calculo férias 2 - calculo salário 3 - sair do sistema)");
				System.out.println("\n?");
				opcao = scanner.nextInt();
				if (!(opcao < 1) || (opcao > 4))
					break;
			}
		} catch (NoSuchElementException elementException) {
			System.err.println("Entrada inválida!");
			System.exit(1);

		}
		return selecaoOperacao[opcao - 1];

	}

	// realiza operação selecionada
	public void realizarCalculoVencimentos() {

		tipoOperacao = selecionarOperacao();

		while (tipoOperacao != MenuOpcoes.TERMINAR_SISTEMA) {

			switch (tipoOperacao) {

			case PAGAMENTO_MENSAL:
				calcularSalarioLiquido();
				break;

			case PAGAMENTO_FERIAS:
				calcularFerias();
				break;

			case TERMINAR_SISTEMA:
				System.out.println("\n\n\t\t\t( Terminado )");
				System.exit(1);
				break;

			default:
				System.out.println("\n\n\t\tDigite uma opção válida!.");
				break;
			}
			tipoOperacao = selecionarOperacao();

		}
		System.out.println("\t\t\t( Terminado )");
	}

}// FIM DA CLASSE CalcularSalario

// INICIO DA ENUM MenuOpcoes
enum MenuOpcoes {

	// constantes do menu de opções
	PAGAMENTO_FERIAS(1), PAGAMENTO_MENSAL(2), TERMINAR_SISTEMA(3);

	int intOpcao;

	MenuOpcoes(int opcao) {

		this.intOpcao = opcao;

	}

	int getValor() {

		return intOpcao;
	}
}// FIM DA ENUM MenuOpcoes
