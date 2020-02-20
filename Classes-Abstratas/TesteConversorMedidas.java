package br.com.estudo;

import javax.swing.JOptionPane;

public class TestaConversor {

	public static void main(String[] args) {

		String strValorPolegada;
		double dblValorCentimetro, dblValorPolegada;

		strValorPolegada = JOptionPane.showInputDialog("Digite o valor em polegadas");
		dblValorPolegada = Float.parseFloat(strValorPolegada);
		PolegadaParaCentimetro PolegadaCentimetro = new PolegadaParaCentimetro(dblValorPolegada);

		PolegadaCentimetro.converte();
		dblValorCentimetro = PolegadaCentimetro.getValor();
		JOptionPane.showMessageDialog(null, "O valor convertido é  " + dblValorCentimetro + " Cm.");

	}

}
