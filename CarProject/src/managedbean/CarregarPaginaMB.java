package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped


public class CarregarPaginaMB implements Serializable{
	
	
	private static final long serialVersionUID = 5970663353606273876L;
	
	String pagina;

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	public void changePageConcessionaria(String pagina){
		System.out.println("Pagina carregada");
		setPagina("cadastroConcessionaria.xhtml");
	}
	
	public void changePageCarro(String pagina){
		System.out.println("Pagina carregada");
		setPagina("cadastroCarro.xhtml");
	}
}
