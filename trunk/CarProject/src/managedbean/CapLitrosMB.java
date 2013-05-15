package managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.Litros;

import persistencia.CapacidadeLitrosDAO;


@ManagedBean
@ViewScoped

public class CapLitrosMB implements Serializable{

	private static final long serialVersionUID = -179671115993898868L;
	
	private Litros cp;
	private CapacidadeLitrosDAO cpDAO;
	
	public CapLitrosMB(){
		cp = new Litros();
		cpDAO = new CapacidadeLitrosDAO();
	}
	
	public void listar(){
		System.out.println("Listado (ok): " + cp.toString());
		cpDAO.getListar();
	}
	
	public Litros getCp(){
		return cp;
	}
	
	public void setCp(Litros cp){
		this.cp = cp;
	}
	
	public List<Litros> getCapacidades(){
		return cpDAO.getListar();
	}
	
}
