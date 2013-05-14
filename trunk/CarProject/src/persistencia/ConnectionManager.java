package persistencia;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4265529542233699058L;

	static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) { }
    }
	
	private static Connection connection;
	
	public static Connection open() throws SQLException, ClassNotFoundException {
		if (connection == null || connection.isClosed()) {
			try{
				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CarrosBD/public", "postgres", "root");
			}catch(SQLException e){
				System.err.println("Error: "+e);
			}
			
        }
		return connection;
	}	
	
	public static void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
