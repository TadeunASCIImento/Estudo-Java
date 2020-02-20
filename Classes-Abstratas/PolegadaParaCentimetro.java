package br.com.estudo;

public class PolegadaParaCentimetro extends ConversaoMedida {

	public PolegadaParaCentimetro(double dblValorOriginal) {
		super(dblValorOriginal);

	}

	@Override
	public void converte() {
		super.setDblValorConvertido(super.getDblValorOriginal() * 2.54);

	}

	public double getValor() {
		return super.getMedida();
	}

}
