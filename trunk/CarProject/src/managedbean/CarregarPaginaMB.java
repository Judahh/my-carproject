package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class CarregarPaginaMB implements Serializable{
	
	
	private static final long serialVersionUID = 5970663353606273876L;
	
	String pagina;

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	public void changePageConcessionaria(){
		System.out.println("Pagina carregada");
		setPagina("cadastroConcessionaria.xhtml");
	}
	
	public void changePageCarro(){
		System.out.println("Pagina carregada");
		setPagina("cadastroCarro.xhtml");
	}
	
	public void changePageBuscarCarro(){
		System.out.println("Pagina carregada");
		setPagina("buscarCarro.xhtml");
	}
}
