package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Inserindo e removendo objetos em um ArrayList.
 */

public class TesteArrayList02 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Item> itens = new ArrayList<Item>();
		for (int i = 0; i < 2; i++) {
			itens.add(getItem());
		}
		print("\nitens no ArrayList antes da exclusão.");
		exibirItensNoArrayList(itens);
		itens.remove(0);// remove o item no indíce 0.
		print("\nitens no ArrayList após a exclusão.");
		exibirItensNoArrayList(itens);
	}

	// inclui novo item no ArrayList.
	private static Item getItem() {
		print("código do item?");
		Long codigo = scanner.nextLong();
		print("descrição do item?");
		String descricao = scanner.next();
		print("preço do item?\n");
		Double preco = scanner.nextDouble();
		Item item = new Item(codigo, descricao, preco);
		return item;
	}

	// exibe os itens do ArrayList.
	private static void exibirItensNoArrayList(ArrayList<Item> itens) {
		for (Item e : itens) {
			print(e);
		}
	}

	// exibi as mensagens
	private static void print(Object object) {
		System.out.print(object);
	}
}

class Item {

	private Long codigo;
	private String descricao;
	private Double preco;

	public Item(Long codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\ncódigo do produto: ");
		builder.append(codigo);
		builder.append("\ndescrição: ");
		builder.append(descricao);
		builder.append("\npreço: ");
		builder.append(preco);
		builder.append("\n");
		return builder.toString();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
