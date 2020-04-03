package br.com.estudo;

public class CodificandoMensagenComXor {

	public static void main(String[] args) {

		String codmsg = " ";
		String decmsg = " ";
		int key = 54;

		StringBuilder buffer = new StringBuilder();
		buffer.append("Codificando uma String em um StringBuilder com operador XOR.");

		System.out.println("\n\t\tMensagen original: " + buffer);

		// Codifica mensagem
		for (int i = 0; i < buffer.length(); i++)
			codmsg = codmsg + (char) (buffer.charAt(i) ^ key);
		System.out.println("\n\t\tMensagen codificada: " + codmsg);

		// Decodifica a mensagem
		for (int i = 1; i < buffer.length(); i++)
			decmsg = decmsg + (char) (codmsg.charAt(i) ^ key);
		System.out.println("\n\t\tMensagem decodificada: " + decmsg);
	}

}
