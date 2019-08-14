package br.com.estudo;

import java.util.PriorityQueue;

public class PriorityQueueTeste {

	public static void main(String[] args) {

		// Fila de capacidade.
		PriorityQueue<Double> fila = new PriorityQueue<Double>();

		Double array[] = { 20.0, 1.0, 2.0, 3.0, 5.0, 6.0, 8.0, 9.0, 4.0, 3.0, 5.0, 13.0 };

		// Insere elementos na fila.
		for (double numero : array)
			fila.offer(numero);
		System.out.println();

		// Exibe os elementos da fila.
		while (fila.size() > 0) {
			System.out.printf(" %.1f", fila.peek());
			fila.poll();

		}

	}

}
