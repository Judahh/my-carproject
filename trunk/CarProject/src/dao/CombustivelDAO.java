package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Combustivel;

public class CombustivelDAO implements Serializable{


	private static final long serialVersionUID = -4389423331774842273L;
	List <Combustivel> selectCombustivel = new ArrayList <Combustivel>();
	
	public List <Combustivel> getListar() {
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT cod_combustivel, combustivel from table_combustivel");
		
			ResultSet rs;
			rs = ps.executeQuery();
			
			while(rs.next()){
				Combustivel tp = new Combustivel();
				tp.setCodCombustivel(rs.getInt("cod_combustivel"));
				tp.setCombustivel(rs.getString("combustivel"));
				
				selectCombustivel.add(tp);
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
		return selectCombustivel;		
	}
}
