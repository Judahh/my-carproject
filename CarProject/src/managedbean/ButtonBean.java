package managedbean;

import javax.faces.event.ActionEvent; 
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped

public class ButtonBean implements Serializable{
	
	
	private static final long serialVersionUID = 4545215086504501801L;

				
		public void confirmaCadastro (ActionEvent actionEvent){
			
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "System Error", "Please try again later.");
			
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	
		
		
	
}
