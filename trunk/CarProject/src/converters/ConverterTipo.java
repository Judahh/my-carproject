package converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import beans.TipoCarro;

public class ConverterTipo implements Converter, Serializable{

	
	private static final long serialVersionUID = 4662226629211015178L;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		TipoCarro tipo = new TipoCarro();
		tipo.setNome(arg2);
		return tipo;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null && arg2 instanceof TipoCarro){
			return((TipoCarro)arg2).getNome();
		}
		
		return "";
	}

}
