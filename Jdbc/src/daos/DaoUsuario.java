package br.com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.entities.Entitie;
import br.com.entities.Usuario;

public class DaoUsuario extends Dao implements DaoFunctions, InstrucoesSql {

	public boolean validarUsuario(String user, String pass) {

		try {
      this.obterConexao();
			this.pstm = this.conn.prepareStatement(VALIDAR_USUARIO);
			this.resultado = this.pstm.executeQuery();
			  while (this.resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setUsuario(this.resultado.getString("usuario"));
				usuario.setSenha(this.resultado.getString("senha"));
				if (usuario.getUsuario().equalsIgnoreCase(user) && usuario.getSenha().equalsIgnoreCase(pass))
					return true;
			}

		} catch (SQLException exc) {
			System.out.println("Erro ao conectar ao banco.");
			exc.printStackTrace();

		}
		return false;

	}


		@Override
		public boolean add(Entitie entitie) {
			Usuario usuario = (Usuario) entitie;
			try {
				this.obterConexao();
				this.pstm = this.conn.prepareStatement(INSERT_USUARIO);
				this.pstm.setString(1, usuario.getNome());
				this.pstm.setString(2, usuario.getCpf());
				this.pstm.setString(3, usuario.getUsuario());
				this.pstm.setString(4, usuario.getSenha());
				this.pstm.execute();
			} catch (SQLException exc) {
				exc.printStackTrace();
				return false;
			}
			return true;
		}

		@Override
		public Usuario findOne(int id) {

			Usuario usuario = new Usuario();
			try {
				this.obterConexao();
				this.pstm = this.conn.prepareStatement(SELECT_USUARIO + id);
				this.resultado = this.pstm.executeQuery();
				while (this.resultado.next()) {
					usuario.setId(this.resultado.getInt("id"));
					usuario.setNome(this.resultado.getString("nome"));
					usuario.setCpf(this.resultado.getString("cpf"));
					usuario.setUsuario(this.resultado.getString("usuario"));
					usuario.setSenha(this.resultado.getString("senha"));
				}
			} catch (SQLException exc) {
				exc.printStackTrace();

			}
			return usuario;
		}



}
