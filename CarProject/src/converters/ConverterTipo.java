package converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import beans.TipoCarro;

@FacesConverter(forClass = TipoCarro.class)
public class ConverterTipo implements Converter, Serializable{

	private static final long serialVersionUID = 4662226629211015178L;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 != null && !arg2.trim().isEmpty()){
			TipoCarro tipo = new TipoCarro();
			tipo.setCodTipo(Integer.parseInt(arg2));
			return tipo;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null && arg2 instanceof TipoCarro){
			TipoCarro tipo = (TipoCarro) arg2;
			if(tipo.getCodTipo() != null){
				return tipo.getCodTipo().toString();
			}
		}
		return null;
	}

}
