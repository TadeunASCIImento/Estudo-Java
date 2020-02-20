package br.com.estudo;

public abstract class ConversaoMedida {

	private double dblValorOriginal, dblValorConvertido;

	public ConversaoMedida(double dblValorOriginal) {
		this.dblValorOriginal = dblValorOriginal;

	}

	public double getDblValorOriginal() {
		return dblValorOriginal;
	}

	public void setDblValorConvertido(double dblValorConvertido) {
		this.dblValorConvertido = dblValorConvertido;
	}

	public double getMedida() {
		return dblValorConvertido;

	}

	public abstract void converte();

}
