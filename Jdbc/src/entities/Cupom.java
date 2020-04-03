package br.com.entities;

public class Cupom extends Entitie {

	private int id;
	private int codigo;
	private String descricao;
	private int pontos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodCupom() {
		return codigo;
	}

	public void setCodCupom(int codCupom) {
		this.codigo = codCupom;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumPontos() {
		return pontos;
	}

	public void setNumPontos(int numPontos) {
		this.pontos = numPontos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nId: ");
		builder.append(id);
		builder.append("\ncodigo: ");
		builder.append(codigo);
		builder.append("\nDescricao: ");
		builder.append(descricao);
		builder.append("\npontos: ");
		builder.append(pontos);
		return builder.toString();
	}

}
