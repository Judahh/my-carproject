package managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	
	private List<Carro> carros;
	
	public CarroMB(){
		carro = new Carro();
		carroDAO = new CarroDAO();	
		carros = new ArrayList<Carro>();
	}
	
	public void inserir(){
		carroDAO.inserirCarro( carro );
		System.out.println("Inserido (ok): " + carro.toString());
	}
	
	public void buscar(){
		carro = carroDAO.buscar(carro);	
		System.out.println("Busca (ok): " + carro.toString());
	}
	
	public Carro getCarro(){
		return carro;
	}
	
	
	public void setCarro(Carro carro){
		this.carro = carro;
	}
	
	public List<Carro> getCarros(){
		return carros; 
	}
	
	public void acao(){
		carros = carroDAO.listar(carro.getMarca());
	}
}
