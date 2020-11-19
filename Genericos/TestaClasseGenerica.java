package br.com.genericos;

import java.math.BigDecimal;

public class TestaClasseGenerica {

	public static void main(String[] args) {
		ClasseGenerica<String, String, Integer> dadosGenericos =
				new ClasseGenerica<String, String, Integer>("Tadeu","Nascimento", 36);
		System.out.println(dadosGenericos.toString());

		ClasseGenerica<Integer, Long, BigDecimal> outrosDadosGenericos =
				new ClasseGenerica<Integer, Long, BigDecimal>(
				123, 234l, new BigDecimal(45));
         System.out.println(outrosDadosGenericos);
	}

}
