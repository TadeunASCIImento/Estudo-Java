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

 @Override
 public boolean update(Entitie entitie) {
  Cupom cupom = (Cupom) entitie;
  try {
   this.obterConexao();
   this.pstm = this.conn.prepareStatement(UPDATE_CUPOM + cupom.getId());
   this.pstm.setInt(1, cupom.getId());
   this.pstm.setInt(2, cupom.getCodCupom());
   this.pstm.setString(3, cupom.getDescricao());
   this.pstm.setInt(4, cupom.getNumPontos());
   this.pstm.executeUpdate();
   return true;
  } catch (SQLException sqlExc) {
   sqlExc.printStackTrace();
   return false;
  }
 }

 @Override
 public List < Entitie > findAll() {
  List < Entitie > listEntities = new ArrayList < > ();

  try {
   this.obterConexao();
   this.pstm = conn.prepareStatement(LISTAR_CUPONS);
   this.resultado = this.pstm.executeQuery();
   while (this.resultado.next()) {
    Cupom cupom = new Cupom();
    cupom.setId(this.resultado.getInt("id"));
    cupom.setCodCupom(this.resultado.getInt("codigo"));
    cupom.setDescricao(this.resultado.getString("descricao"));
    cupom.setNumPontos(this.resultado.getInt("pontos"));
    listEntities.add(cupom);
   }
   return listEntities;
  } catch (SQLException sqlExc) {
   sqlExc.printStackTrace();
   return null;
  }
 }

 @Override
 public Entitie findOne(int id) {
  Cupom cupom = new Cupom();
  try {
   this.obterConexao();
   this.pstm = this.conn.prepareStatement(SELECT_CUPOM + id);
   this.resultado = pstm.executeQuery();
   while (this.resultado.next()) {
    cupom.setId(this.resultado.getInt("id"));
    cupom.setCodCupom(this.resultado.getInt("codigo"));
    cupom.setDescricao(this.resultado.getString("descricao"));
    cupom.setNumPontos(this.resultado.getInt("pontos"));
   }
   return cupom;
  } catch (SQLException sqlExc) {
   sqlExc.printStackTrace();
   return null;
  }
 }

}
