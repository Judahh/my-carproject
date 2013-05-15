package converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import beans.Combustivel;

@FacesConverter(forClass = Combustivel.class)
public class ConverterCombustivel implements Converter, Serializable{

	
	private static final long serialVersionUID = -6427101992886331886L;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 != null && !arg2.trim().isEmpty()){
			Combustivel comb = new Combustivel();
			comb.setCodCombustivel(Integer.parseInt(arg2));
			return comb;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null && arg2 instanceof Combustivel){
			Combustivel comb = (Combustivel) arg2;
			if(comb.getCodCombustivel() != null){
				return comb.getCodCombustivel().toString();
			}
		}
		return null;
	}

		
}
