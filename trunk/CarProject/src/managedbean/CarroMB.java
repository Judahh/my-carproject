package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.CarroDAO;

import beans.Carro;

@ManagedBean
@ViewScoped

public class CarroMB implements Serializable{
	
	
	private static final long serialVersionUID = 6376895370967087593L;
	
	private Carro carro;
	private CarroDAO carroDAO;
	
	public CarroMB(){
		carro = new Carro();
		carroDAO = new CarroDAO();
	}
	
	public void inserir(){
		System.out.println("Inserido (ok): " + carro.toString());
		carroDAO.inserirCarro( carro );
	}
	
	public void buscar(){
		System.out.println("Busca (ok): " + carro.toString());
		carroDAO.getBuscar();		
	}
	
	public Carro getCarro(){
		return carro;
	}
	
	public void setCarro(Carro carro){
		this.carro = carro;
	}
}
