package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Carro;


public class CarroDAO implements Serializable{

	
	private static final long serialVersionUID = 9101854494025273093L;
	
	public String inserirCarro(Carro ca) {
		
		String cadastro_ok = "CADASTRO_EFETUADO";
		String cadastro_fail = "FALHA_CADASTRO";
		
		Connection c = null;
		PreparedStatement ps = null;
		try{
			c = ConnectionManager.open();
			
			
			
			System.out.println("1");
			
			StringBuilder sb = new StringBuilder("INSERT INTO table_carros (cod_carro, preco_tabelado, marca, modelo, ");
			sb.append("tipo, potencia, capacidade_litros, tipo_tracao, posicao_motor, combustivel, autonomia_km, km_cidade, km_estrada, ");
			sb.append("num_assentos, volume_bagageiro, volume_tanque, qnt_portas, area_cega, aceleracao, velocidade_max, ano) VALUES ( ");
			sb.append("? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?, ?, ?, ? ) ");
			
			System.out.println("2");
			ps = c.prepareStatement( sb.toString() );
			
			ps.setInt(1 ,  ca.getCodCarro());
			ps.setBigDecimal(2, ca.getPrecoTabelado());
			ps.setString(3, ca.getMarca().toUpperCase());
			ps.setString(4, ca.getModelo().toUpperCase());
			ps.setString(5, ca.getTipo().getNome());
			ps.setDouble(6, ca.getPotencia());
			ps.setString(7, ca.getCapacidadeLitros().getCapacidadeLitros());
			ps.setString(8, ca.getTipoTracao());
			ps.setString(9, ca.getPosicaoMotor());
			ps.setString(10, ca.getCombustivel().getCombustivel());
			ps.setDouble(11, ca.getAutonomiaKM());
			ps.setDouble(12, ca.getKmCidade());
			ps.setDouble(13, ca.getKmEstrada());
			ps.setInt(14, ca.getNumAssentos());
			ps.setDouble(15, ca.getVolumeBagageiro());
			ps.setDouble(16, ca.getVolumeTanque());
			ps.setInt(17, ca.getQntPortas());
			ps.setDouble(18, ca.getAreaCega());
			ps.setDouble(19, ca.getAceleracao());
			ps.setInt(20, ca.getVelocidadeMax());
			ps.setDate(21, new java.sql.Date(ca.getAno().getTime()));
			System.out.println("4");
			
			ps.execute();
			System.out.println("5");
			return cadastro_ok;
			
		}catch(SQLException ex){
			System.out.println("Erro ao cadastrar");
			ex.printStackTrace();
			
		}catch(ClassNotFoundException cn){
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
		
		return cadastro_fail;
		}
	
	}
	
