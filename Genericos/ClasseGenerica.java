package br.com.genericos;

public class ClasseGenerica<T1, T2, T3> {

	T1 dado1;
	T2 dado2;
	T3 dado3;

	public ClasseGenerica(T1 dado1, T2 dado2, T3 dado3) {
		setDado1(dado1);
		setDado2(dado2);
		setDado3(dado3);

	}

	public T1 getDado1() {
		return dado1;
	}

	public void setDado1(T1 dado1) {
		this.dado1 = dado1;
	}

	public T2 getDado2() {
		return dado2;
	}

	public void setDado2(T2 dado2) {
		this.dado2 = dado2;
	}

	public T3 getDado3() {
		return dado3;
	}

	public void setDado3(T3 dado3) {
		this.dado3 = dado3;
	}

	@Override
	public String toString() {
		return String.format("ClasseGenerica dado1 %s, dado2 %s, dado2 %s", dado3, dado1, dado2);
	}
}
