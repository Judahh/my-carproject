package managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.CapacidadeLitros;

import persistencia.CapacidadeLitrosDAO;


@ManagedBean
@ViewScoped

public class CapLitrosMB implements Serializable{

	private static final long serialVersionUID = -179671115993898868L;
	
	private CapacidadeLitros cp;
	private CapacidadeLitrosDAO cpDAO;
	
	public CapLitrosMB(){
		cp = new CapacidadeLitros();
		cpDAO = new CapacidadeLitrosDAO();
	}
	
	public void listar(){
		System.out.println("Listado (ok): " + cp.toString());
		cpDAO.getListar();
	}
	
	public CapacidadeLitros getCp(){
		return cp;
	}
	
	public void setCp(CapacidadeLitros cp){
		this.cp = cp;
	}
	
	public List<CapacidadeLitros> getCapacidades(){
		return cpDAO.getListar();
	}
	
}
