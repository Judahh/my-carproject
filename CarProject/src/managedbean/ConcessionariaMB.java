package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import dao.ConcessionariaDAO;
import entidade.Concessionaria;

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
	
	public Concessionaria getConcessionaria(){
		return concessionaria;
	}
	
	public void setConcessionaria(Concessionaria concessionaria){
		this.concessionaria = concessionaria;
	}
}
