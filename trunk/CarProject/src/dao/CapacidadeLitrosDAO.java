package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.CapacidadeLitros;

public class CapacidadeLitrosDAO implements Serializable{
	
	
	private static final long serialVersionUID = 6409693878451339699L;
	
	
	
	public List <CapacidadeLitros> getListar(){
		
		Connection c = null;
		PreparedStatement ps = null;
		List <CapacidadeLitros> selectLitro = new ArrayList <CapacidadeLitros>();
		
		try{
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT cod_cap, capacidade_litros from table_cap_litros");
			
			ResultSet rs;
			rs = ps.executeQuery();
			
			while(rs.next()){
				CapacidadeLitros cl = new CapacidadeLitros();
				cl.setCodCap(rs.getInt("cod_cap"));
				cl.setCapacidadeLitros(rs.getString("capacidade_litros"));
				
				selectLitro.add(cl);
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
			
		
		return selectLitro;
		
	}
}
