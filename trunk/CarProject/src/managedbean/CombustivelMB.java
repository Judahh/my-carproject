package managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.Combustivel;
import dao.CombustivelDAO;


@ManagedBean
@ViewScoped

public class CombustivelMB implements Serializable{

	
	private static final long serialVersionUID = -5466941780862454096L;
	
	private Combustivel combustivel;
	private CombustivelDAO combustivelDAO;
	
	public CombustivelMB(){
		combustivel = new Combustivel();
		combustivelDAO = new CombustivelDAO();
	}
	
	public void listar(){
		System.out.println("Listado (ok): " + combustivel.toString());
		combustivelDAO.getListar();
	}
	
	public Combustivel getCombustivel(){
		return combustivel;
	}
	
	public void setCombustivel(Combustivel combustivel){
		this.combustivel = combustivel;
	}
	
	public List<Combustivel> getCombustiveis(){
		return combustivelDAO.getListar();
	}

}
