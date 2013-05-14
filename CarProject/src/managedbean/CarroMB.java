package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.Carro;

import persistencia.CarroDAO;


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
		System.out.println("TESTE");
		carroDAO.inserirCarro( carro );
		System.out.println("Inserido (ok): " + carro.toString());
	}
	
	public void buscar(){
		carroDAO.buscar(carro);	
		System.out.println("Busca (ok): " + carro.toString());
	}
	
	public Carro getCarro(){
		return carro;
	}
	
	public void setCarro(Carro carro){
		this.carro = carro;
	}
	
}
