package br.com.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entities.Cupom;
import br.com.entities.Entitie;

public class DaoCupom extends Dao implements DaoFunctions, InstrucoesSql {

	@Override
	public boolean add(Entitie entitie) {
		Cupom cupom = (Cupom) entitie;
		try {
			this.obterConexao();
			this.pstm = this.conn.prepareStatement(INSERT_CUPOM);
			this.pstm.setLong(1, cupom.getCodCupom());
			this.pstm.setString(2, cupom.getDescricao());
			this.pstm.setLong(3, cupom.getNumPontos());
			this.pstm.execute();
			return true;
		} catch (SQLException sqlExc) {
			sqlExc.printStackTrace();
			return false;
		}
	}

  @Override
  public boolean delete(int id) {
  try {
    this.obterConexao();
    this.pstm = this.conn.prepareStatement(DELETE_CUPOM + id);
    pstm.executeUpdate();
    return true;
  } catch (SQLException sqlExc) {
    sqlExc.printStackTrace();
    return false;
  }
}



}
