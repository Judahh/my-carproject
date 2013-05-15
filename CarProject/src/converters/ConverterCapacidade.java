package converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import beans.Litros;

@FacesConverter(forClass = Litros.class)
public class ConverterCapacidade implements Converter, Serializable {

	
	private static final long serialVersionUID = -4519523355969187548L;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 != null && !arg2.trim().isEmpty()){
			Litros capLitros = new Litros();
			capLitros.setCodCap(Integer.parseInt(arg2));
			return capLitros;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null && arg2 instanceof Litros){
			Litros capLitros = (Litros) arg2;
			if(capLitros.getCodCap() != null){
				return capLitros.getCodCap().toString();
			}
		}
		
		return null;
	}
	
	
	
	
}
