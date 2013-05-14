package beans;

import java.io.Serializable;

public class TipoCarro implements Serializable{


	private static final long serialVersionUID = 1658973657336331569L;
	
	private Integer codTipo;
	private String nome;
	
	public Integer getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(Integer codTipo) {
		this.codTipo = codTipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "TipoCarro [codTipo=" + codTipo + ", nome=" + nome + "]";
	}
	
	
	
}
