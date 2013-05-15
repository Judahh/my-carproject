package managedbean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.Concessionaria;

import persistencia.ConcessionariaDAO;


@ManagedBean
@ViewScoped
public class ConcessionariaMB implements Serializable{
	
	
	private static final long serialVersionUID = -5008137870351545171L;
	
	private Concessionaria concessionaria;
	private ConcessionariaDAO concessionariaDAO;
	
	public ConcessionariaMB(){
		concessionaria = new Concessionaria();
		concessionariaDAO = new ConcessionariaDAO();
	}
	
	public void inserir(){
		concessionariaDAO.inserirConcessionaria( concessionaria );
		System.out.println("Inserido (ok): " + concessionaria.toString());
	}
	
	public void buscar(){
		concessionaria = concessionariaDAO.buscar (concessionaria);
		System.out.println("Busca (ok): " +concessionaria.toString());
	}
	public Concessionaria getConcessionaria(){
		return concessionaria;
	}
	
	public void setConcessionaria(Concessionaria concessionaria){
		this.concessionaria = concessionaria;
	}
}
