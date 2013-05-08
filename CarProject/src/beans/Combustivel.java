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
	
	
	
}
