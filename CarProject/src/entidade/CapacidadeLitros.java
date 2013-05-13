package entidade;

import java.io.Serializable;

public class CapacidadeLitros implements Serializable{
	
	
	private static final long serialVersionUID = -7113378161012723498L;
	
	private Integer codCap;
	private String capacidadeLitros;
	
	public Integer getCodCap() {
		return codCap;
	}
	public void setCodCap(Integer codCap) {
		this.codCap = codCap;
	}
	public String getCapacidadeLitros() {
		return capacidadeLitros;
	}
	public void setCapacidadeLitros(String capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	
	@Override
	public String toString() {
		return "CapacidadeLitros [codCap=" + codCap + ", capacidadeLitros="
				+ capacidadeLitros + "]";
	}
	
}	
