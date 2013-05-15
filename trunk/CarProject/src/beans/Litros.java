package beans;

import java.io.Serializable;

public class Litros implements Serializable{
	
	
	private static final long serialVersionUID = -7113378161012723498L;
	
	private Integer codCap;
	private String capacidade;
	
	public Integer getCodCap() {
		return codCap;
	}
	public void setCodCap(Integer codCap) {
		this.codCap = codCap;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		return "CapacidadeLitros [codCap=" + codCap + ", capacidade="
				+ capacidade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCap == null) ? 0 : codCap.hashCode());
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
		Litros other = (Litros) obj;
		if (codCap == null) {
			if (other.codCap != null)
				return false;
		} else if (!codCap.equals(other.codCap))
			return false;
		return true;
	}
}	
