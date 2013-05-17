package persistencia;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Carro;
import beans.Combustivel;
import beans.Litros;
import beans.TipoCarro;


public class CarroDAO implements Serializable {

	private static final long serialVersionUID = 9101854494025273093L;

	public String inserirCarro (Carro ca) {

		String cadastro_ok = "CADASTRO_EFETUADO";
		String cadastro_fail = "FALHA_CADASTRO";

		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = ConnectionManager.open();

			System.out.println("Entrou");

			StringBuilder sb = new StringBuilder("INSERT INTO table_carros (cod_carro, preco_tabelado, marca, modelo, ");
			sb.append("tipo, potencia, capacidade_litros, tipo_tracao, posicao_motor, combustivel, autonomia_km, km_cidade, km_estrada, ");
			sb.append("num_assentos, volume_bagageiro, volume_tanque, qnt_portas, area_cega, aceleracao, velocidade_max, ano) VALUES ( ");
			sb.append("? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?, ?, ?, ? ) ");

			ps = c.prepareStatement(sb.toString());

			ps.setInt(1, ca.getCodCarro());
			ps.setBigDecimal(2, ca.getPrecoTabelado());
			ps.setString(3, ca.getMarca().toUpperCase());
			ps.setString(4, ca.getModelo().toUpperCase());
			//ps.setString(5, ca.getTipo().getNome());
			ps.setString(5, ca.getTipo());
			ps.setDouble(6, ca.getPotencia());
			//ps.setString(7, ca.getCapacidadeLitros().getCapacidade());
			ps.setString(7, ca.getCapacidadeLitros());
			ps.setString(8, ca.getTipoTracao());
			ps.setString(9, ca.getPosicaoMotor());
			//ps.setString(10, ca.getCombustivel().getCombustivel());
			ps.setString(10, ca.getCombustivel());
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
			return cadastro_ok;

		} catch (SQLException ex) {
			System.out.println("Erro ao cadastrar");
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

		return cadastro_fail;
	}

	public Carro buscar(Carro ca) {

		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT * FROM table_carros WHERE cod_carro = ?");
			
			ps.setInt(1, ca.getCodCarro());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				Carro carro = new Carro();
				TipoCarro tp = new TipoCarro();
				Litros cp = new Litros();
				Combustivel com = new Combustivel();

				cp.setCapacidade(rs.getString("capacidade_litros"));
				tp.setNome(rs.getString("tipo"));
				com.setCombustivel(rs.getString("combustivel"));
				
				carro.setCodCarro(rs.getInt("cod_carro"));
				carro.setPrecoTabelado(rs.getBigDecimal("preco_tabelado"));
				carro.setMarca(rs.getString("marca"));
				carro.setModelo(rs.getString("modelo"));
				//carro.setTipo(tp);
				carro.setTipo(rs.getString("tipo"));
				carro.setPotencia(rs.getDouble("potencia"));
				//carro.setCapacidadeLitros(cp);
				carro.setCapacidadeLitros(rs.getString("capacidade_litros"));
				carro.setTipoTracao(rs.getString("tipo_tracao"));
				carro.setPosicaoMotor(rs.getString("posicao_motor"));
				//carro.setCombustivel(com);
				carro.setCombustivel(rs.getString("combustivel"));
				carro.setAutonomiaKM(rs.getDouble("autonomia_km"));
				carro.setKmCidade(rs.getDouble("km_cidade"));
				carro.setKmEstrada(rs.getDouble("km_estrada"));
				carro.setNumAssentos(rs.getInt("num_assentos"));
				carro.setVolumeBagageiro(rs.getDouble("volume_bagageiro"));
				carro.setVolumeTanque(rs.getDouble("volume_tanque"));
				carro.setQntPortas(rs.getInt("qnt_portas"));
				carro.setAreaCega(rs.getDouble("area_cega"));
				carro.setAceleracao(rs.getDouble("aceleracao"));
				carro.setVelocidadeMax(rs.getInt("velocidade_max"));
				carro.setAno(rs.getDate("ano"));

				return carro;
			}

			rs.close();
			c.close();

		} catch (SQLException ex) {
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
	
	public List<Carro> listar(String marca){
		
		Connection c = null;
		PreparedStatement ps = null;
		
	
		try{
			List<Carro> selectCarros = new ArrayList <Carro>();
			
			c = ConnectionManager.open();
			ps = c.prepareStatement("SELECT marca, modelo, potencia, tipo, combustivel, preco_tabelado, ano, qnt_portas FROM table_carros WHERE marca =?");
			
			ps.setString(1, marca.toUpperCase());
			ResultSet rs = ps.executeQuery();
			
			Carro carro;
			while(rs.next()){
				
				carro = new Carro();
				TipoCarro tp = new TipoCarro();
				Combustivel com = new Combustivel();
				
				tp.setNome(rs.getString("tipo"));
				com.setCombustivel(rs.getString("combustivel"));
				
				carro.setMarca(rs.getString("marca"));
				carro.setModelo(rs.getString("modelo"));
				carro.setPotencia(rs.getDouble("potencia"));
				//carro.setTipo(tp);
				//carro.setCombustivel(com);
				carro.setTipo(rs.getString("tipo"));
				carro.setCombustivel(rs.getString("combustivel"));
				carro.setPrecoTabelado(rs.getBigDecimal("preco_tabelado"));
				carro.setAno(rs.getDate("ano"));
				carro.setQntPortas(rs.getInt("qnt_portas"));
				
				selectCarros.add(carro);
				
			}
			
			return selectCarros;
			
		}catch (SQLException ex){
			System.out.println("Erro ao listar");
			ex.printStackTrace();
		}catch (ClassNotFoundException cn) {
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
