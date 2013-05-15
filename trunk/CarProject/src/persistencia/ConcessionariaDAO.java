package persistencia;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Concessionaria;


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
			StringBuilder sb = new StringBuilder("INSERT INTO table_concessionaria(nome_concessionaria, ");
			sb.append("endereco, endereco_web, telefone, telefone2, referencia, ");
			sb.append("bairro, cnpj, email) VALUES ( ");
			sb.append("?, ?, ?, ?, ?, ?, ?, ?, ? )");
			
			ps = c.prepareStatement(sb.toString());
			
			//ps.setInt(1, cc.getCodConcessionaria());
			ps.setString(1, cc.getNomeConcessionaria());
			ps.setString(2, cc.getEndereco());
			ps.setString(3, cc.getEnderecoWEB());
			ps.setString(4, cc.getTelefone());
			ps.setString(5, cc.getTelefone2());
			ps.setString(6, cc.getReferencia());
			ps.setString(7, cc.getBairro());
			ps.setString(8, cc.getCnpj());
			ps.setString(9, cc.getEmail());
			
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
	
	public Concessionaria buscar(Concessionaria con){
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT * FROM table_concessionaria where cnpj = ?");
			
			ps.setString(1, con.getCnpj());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				Concessionaria concessionaria = new Concessionaria();
				
				concessionaria.setNomeConcessionaria(rs.getString("nome_concessionaria"));
				concessionaria.setCnpj(rs.getString("cnpj"));
				concessionaria.setEndereco(rs.getString("endereco"));
				concessionaria.setBairro(rs.getString("bairro"));
				concessionaria.setReferencia(rs.getString("referencia"));
				concessionaria.setEmail(rs.getString("email"));
				concessionaria.setTelefone(rs.getString("telefone"));
				concessionaria.setTelefone2(rs.getString("telefone2"));

				return concessionaria;
			}
				
			rs.close();
			c.close();
		}catch (SQLException ex) {
			System.out.println("Erro ao buscar");
			ex.printStackTrace();

		} catch (ClassNotFoundException cn) {
			System.out.println("ClassNotFound...");
			cn.printStackTrace();

		} finally {
			try {
				if (ps != null)
					ps.close();

				if (c != null)
					c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

