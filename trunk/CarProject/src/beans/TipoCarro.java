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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codTipo == null) ? 0 : codTipo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoCarro other = (TipoCarro) obj;
		if (codTipo == null) {
			if (other.codTipo != null)
				return false;
		} else if (!codTipo.equals(other.codTipo))
			return false;
		return true;
	}
}
