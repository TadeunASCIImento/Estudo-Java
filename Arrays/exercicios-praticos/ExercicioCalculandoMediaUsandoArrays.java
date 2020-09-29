package br.com.estudo;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Exercício, realizando o cálculo da média de um aluno.
 */

public class ExercicioCalculandoMediaUsandoArrays {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Informe o nome do aluno?");
		String nome = scanner.nextLine();
		System.out.println("Informe a disciplina?");
		String discplina = scanner.nextLine();
		System.out.println("Informe as 3 notas do aluno?");
		double notas[] = obterNotas();
		Aluno aluno = new Aluno(nome, discplina, notas);
		System.out.println(aluno.resultadoFinal(aluno));

	}

	private static double[] obterNotas() {
		double[] notas = new double[3];
		for (int i = 0; i < notas.length; i++) {
			double nota = scanner.nextDouble();
			notas[i] = nota;
		}
		return notas;
	}
}

class Aluno {

	private String nome;
	private String disciplina;
	private double[] notas;
	private double media;
	private boolean resultado;

	public Aluno(String nome, String disciplina, double[] notas) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public double mediaFinal(double[] notas) {
		this.media = 0;
		for (double nota : this.notas) {
			this.media += nota;
		}
		return this.media / this.notas.length;
	}

	public boolean isAprovado(double media) {
		if (media >= 6) {
			return true;
		} else if (media < 6) {
			return false;
		}
		return false;
	}

	public String resultadoFinal(Aluno aluno) {
		setMedia(mediaFinal(this.notas));
		setResultado(isAprovado(this.media));
		return aluno.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome do aluno: ");
		builder.append(nome);
		builder.append("\nDisciplina: ");
		builder.append(disciplina);
		builder.append("\nNotas: ");
		builder.append(Arrays.toString(notas));
		builder.append("\nMédia final:");
		builder.append(media);
		builder.append("\nResultado: ");
		if (resultado == false) {
			builder.append("Reprovado");
		} else if (resultado == true) {
			builder.append("Aprovado");
		}
		return builder.toString();
	}

}
