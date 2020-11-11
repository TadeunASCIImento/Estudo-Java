package br.com.tadeu.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao2 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Java", 34));
		cursos.add(new Curso("Python", 123));
		cursos.add(new Curso("HTML5", 45));
		cursos.add(new Curso("MySQL", 78));
		cursos.add(new Curso("JavaScript", 67));

		// ordena usando comparing
		cursos.sort(Comparator.comparing(Curso::getAlunos));
    cursos.sort((c1, c2) -> Integer.compare(c1.getAlunos(), c2.getAlunos()));
    cursos.forEach(System.out::println);

		// usando filter e forEach de filter.
		cursos.stream().filter(curso -> curso.getAlunos() >=50).forEach(System.out::println);

		// usando stream , filter e forEach
		cursos.stream().filter(c -> c.getAlunos() > 0).forEach(System.out::println);

		// usando map
		cursos.stream().filter(c -> c.getAlunos() > 0).map(Curso::getCurso).forEach(System.out::println);

		// usando mapToint E sum para somar o numero de alunos
		int totalAlunos = cursos.stream().filter(c -> c.getAlunos() > 0).mapToInt(Curso::getAlunos).sum();
		System.out.println("Total de Alunos: " + totalAlunos);
	}
}

class Curso {

	private String curso;
	private Integer alunos;

	public Curso(String curso, Integer alunos) {
		this.curso = curso;
		this.alunos = alunos;
	}

	public String getCurso() {
		return curso;
	}

	public Integer getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "Curso: " + curso + " ,Alunos: " + alunos;
	}

}
