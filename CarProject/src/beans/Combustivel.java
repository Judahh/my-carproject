package beans;

import java.io.Serializable;

public class Combustivel implements Serializable{


	private static final long serialVersionUID = 7822822433966621572L;
	
	private Integer codCombustivel;
	private String combustivel;
	
	public Integer getCodCombustivel() {
		return codCombustivel;
	}
	public void setCodCombustivel(Integer codCombustivel) {
		this.codCombustivel = codCombustivel;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	@Override
	public String toString() {
		return "Combustivel [codCombustivel=" + codCombustivel
				+ ", combustivel=" + combustivel + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codCombustivel == null) ? 0 : codCombustivel.hashCode());
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
		Combustivel other = (Combustivel) obj;
		if (codCombustivel == null) {
			if (other.codCombustivel != null)
				return false;
		} else if (!codCombustivel.equals(other.codCombustivel))
			return false;
		return true;
	}
	
}
