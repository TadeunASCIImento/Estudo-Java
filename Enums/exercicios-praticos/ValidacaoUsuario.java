package br.com.estudo;

import java.util.Scanner;

// enum Usuarios
enum Usuarios {

	// usuários cadastrados no sistema
	USUARIO_ROOT("root", "@#$1970"), USUARIO_PADRAO("usuario", "qwerty@#$");

	String strUsuario, strSenha;

	// construtor da enum
	Usuarios(String usuario, String senha) {

		this.strUsuario = usuario;
		this.strSenha = senha;
	}

	// metodos de acesso
	public String getUsuario(String usuario) {

		return strUsuario;

	}

	public String getSenha(String senha) {

		return strSenha;

	}
}

// classe aninhada para teste da enum
public class LoginUsandoEnum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com usuário e senha:\nUsuário ");
		String usuario = input.next();
		System.out.println("Senha?");
		String senha = input.next();

		validarUsuarioSistema(usuario, senha);
		validarUsuarioSistema(Usuarios.USUARIO_ROOT);
		validarUsuarioSistema(Usuarios.USUARIO_PADRAO);

		input.close();

	}

	// metodos sobrecarregados realizam validação de usuário e senha

	// realiza validação de usuário e senha fornecidos via teclado
	private static void validarUsuarioSistema(String usuario, String senha) {
		if (usuario.equals(Usuarios.USUARIO_ROOT.strUsuario) && senha.equals(Usuarios.USUARIO_ROOT.strSenha)
				|| usuario.equals(Usuarios.USUARIO_PADRAO.strUsuario) && senha.equals(Usuarios.USUARIO_PADRAO.strSenha))
			System.out.println("Acesso liberado.");
		else
			System.out.println("Acesso não liberado");

	}

	// realiza a validação usando como argumento objeto da enum Usuarios
	private static void validarUsuarioSistema(Usuarios usuario) {
		if (usuario.equals(Usuarios.USUARIO_ROOT) | usuario.equals(Usuarios.USUARIO_PADRAO))
			System.out.println("Acesso liberado");
		else
			System.out.println("Acesso não liberado");
	}

}
