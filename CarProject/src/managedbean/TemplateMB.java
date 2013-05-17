package managedbean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class TemplateMB implements Serializable{
	
	
	private static final long serialVersionUID = -8875549775410542430L;
	Date hoje = new Date();

	public String data(){
		String formato="dd/MM/yyyy";
		SimpleDateFormat formatada= new SimpleDateFormat(formato);
		return("Data de Hoje: "+formatada.format(hoje));
	}
		
	public String dataMes(){
		String formato="dd/MM/yyyy";
		SimpleDateFormat form= new SimpleDateFormat(formato);
		return(""+form.format(hoje).substring(0,5));
	}
			
	public String dataNormal(){
		String formato="dd/MM/yy";
		SimpleDateFormat formatada= new SimpleDateFormat(formato);
		return(""+formatada.format(hoje));
	}	
	
}	
	
	
	

