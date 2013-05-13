package entidade;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.ConnectionManager;

@ManagedBean
@ViewScoped

public class UsuarioBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5933153655108828644L;
	
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validateLogin(){
		Connection c = null;
		PreparedStatement ps = null;
		
		String result_login = "LOGIN_EFETUADO";
		String result_loginInvalido = "LOGIN_INVALIDO";
		
		try{
			c = ConnectionManager.open();
			
			ps = c.prepareStatement("SELECT login, senha from login_admin WHERE login = '"
					+ login
					+ "' and senha = '"
					+ password + "'");
			
			ResultSet rs;
			rs = ps.executeQuery();
								
			rs.next();
			rs.getString(1);
			rs.getString(2);
			
			return result_login;
			
		} catch(SQLException ex){
			System.out.println("Erro ao recuperar login/senha");
		
		} catch (ClassNotFoundException e){
			System.out.println("ClassNotFound...");
			e.printStackTrace();
		}
	
		return result_loginInvalido;
	}
}
