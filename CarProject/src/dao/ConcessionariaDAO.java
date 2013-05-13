package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidade.Concessionaria;



public class ConcessionariaDAO implements Serializable{


	private static final long serialVersionUID = 8294226747737692930L;
	
	public String inserirConcessionaria (Concessionaria cc) {
		
		String cadastro_ok = "CADASTRO_EFETUADO";
		String cadastro_fail = "FALHA_CADASTRO";
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{
			c = ConnectionManager.open();			
			
			System.out.println("Entrou!");
			StringBuilder sb = new StringBuilder("INSERT INTO table_concessionaria(cod_concessionaria, nome_concessionaria, ");
			sb.append("endereco, endereco_web, telefone, telefone2, referencia, ");
			sb.append("bairro, cnpj, email) VALUES ( ");
			sb.append("?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");
			
			ps = c.prepareStatement(sb.toString());
			
			ps.setInt(1, cc.getCodConcessionaria());
			ps.setString(2, cc.getNomeConcessionaria());
			ps.setString(3, cc.getEndereco());
			ps.setString(4, cc.getEnderecoWEB());
			ps.setString(5, cc.getTelefone());
			ps.setString(6, cc.getTelefone2());
			ps.setString(7, cc.getReferencia());
			ps.setString(8, cc.getBairro());
			ps.setString(9, cc.getCnpj());
			ps.setString(10, cc.getEmail());
			
			//Usa ResultSet para selects, e "executeQuery" para resultset tambem
			
			ps.execute();
			return cadastro_ok;
			
		}catch(SQLException ex){
			System.out.println("Erro ao cadastrar");
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
		
		return cadastro_fail;
				
	}
	
}
