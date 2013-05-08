package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.TipoCarro;

public class TipoCarroDAO implements Serializable{
	
	
	private static final long serialVersionUID = -5397659604693380447L;
	
	List <TipoCarro> selectTipo = new ArrayList <TipoCarro>();
	
	public List <TipoCarro> getListar() {
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT cod_tipo, nome from table_tipo_carros");
		
			ResultSet rs;
			rs = ps.executeQuery();
			
			while(rs.next()){
				TipoCarro tp = new TipoCarro();
				tp.setCodTipo(rs.getInt("cod_tipo"));
				tp.setNome(rs.getString("nome"));
				
				selectTipo.add(tp);
			}
			
		}catch(SQLException ex){
			System.out.println("Erro ao listar");
			ex.printStackTrace();
			
		}catch(ClassNotFoundException cn){
			System.out.println("ClassNotFound...");
			cn.printStackTrace();
			
		}finally {
			try {
				if (ps != null)
					ps.close();
				
				if (c != null)
					c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return selectTipo;		
	}

}
