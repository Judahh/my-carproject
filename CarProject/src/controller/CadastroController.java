package controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import beans.Carro;
import beans.Concessionaria;

@ManagedBean
@SessionScoped

public class CadastroController implements Serializable{
	
	
	private static final long serialVersionUID = 496759775289258325L;
	
	private Carro carro;
	private Concessionaria concessionaria;
	
	public String iniciarTelaCarro(){
		this.setCarro(new Carro());
		return "cadastroCarro";
	}
	
	public String iniciarTelaConcessionaria(){
		this.setConcessionaria(new Concessionaria());
		return "cadastroConcessionaria";
	}
	
	public void validarEspacoBranco(FacesContext contexto, UIComponent componente, Object valor){
		String valorString = (String) valor;
		
		if(valorString.trim().equals("")){
			((UIInput) componente).setValid(false);
			String mensagem = componente.getAttributes().get("label") + ": Valor inválido, " +
					"preencha com caracteres diferentes de espaço.";
			
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
			contexto.addMessage(componente.getClientId(contexto), facesMessage);
		}
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Concessionaria getConcessionaria() {
		return concessionaria;
	}

	public void setConcessionaria(Concessionaria concessionaria) {
		this.concessionaria = concessionaria;
	}
	
}
