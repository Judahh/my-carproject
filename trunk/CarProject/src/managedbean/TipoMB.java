package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.TipoCarro;
import dao.TipoCarroDAO;

@ManagedBean
@ViewScoped

public class TipoMB implements Serializable {


	private static final long serialVersionUID = -3358402833867937437L;
	
	private TipoCarro tp;
	private TipoCarroDAO tpDAO;
	
	public TipoMB(){
		tp = new TipoCarro();
		tpDAO = new TipoCarroDAO();
	}
	
	public void listar(){
		System.out.println("Listado (ok):" + tp.toString());
		tpDAO.getListar();
	}
	
	public TipoCarro getTp(){
		return tp;
	}
	
	public void setTp(TipoCarro tp){
		this.tp = tp;
	}
}
