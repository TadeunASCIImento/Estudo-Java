package br.com.estudo;

import java.util.ArrayList;

public class TesteArrayList01 {

	public static void main(String[] args) {

		// cria arrayList de inteiros
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int cont = 0; cont < 15; cont++)// conta de 0 - 14
			intArrayList.add(cont);// inserindo elementos no arrayList
		// exibe no console os elementos
		System.out.println("\nintArrayList elementos:" + intArrayList);

		// cria um arrayList do tipo double
		ArrayList<Double> dblArrayList = new ArrayList<Double>();
		for (double cont = 0.0; cont < 10.0; cont++)
			dblArrayList.add(cont);
		System.out.println("\ndblArrayList elementos:" + dblArrayList);

		// cria um arrayList do tipo float
		ArrayList<Float> fltArrayList = new ArrayList<Float>();
		for (float cont = 0F; cont < 10F; cont++)
			fltArrayList.add(cont);
		System.out.println("\nfltArrayList elementos:" + fltArrayList);

		// cria um arrayList do tipo Number
		ArrayList<Number> numArrayList = new ArrayList<Number>();
		byte nByte = (byte) 128;
		numArrayList.add(1000);// insere tipo inteiro
		numArrayList.add(200L);// insere tipo Long
		numArrayList.add(3.0F);// insere tipo float
		numArrayList.add(20.0);// insere tipo double
		numArrayList.add(nByte);// insere tipo byte
		System.out.println("\nsnumArrayList elementos:" + numArrayList);

		// cria um arrayList do tipo String
		ArrayList<String> strArrayList = new ArrayList<String>();
		// inserindo as strings no arrayList
		strArrayList.add("string01");
		strArrayList.add("string02");
		strArrayList.add("string03");
		strArrayList.add("string04");
		strArrayList.add("string05");
		System.out.println("\nstrArrayList elementos:" + strArrayList);

	}

}
