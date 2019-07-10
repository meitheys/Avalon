package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	//Metodo de conexão
	public static Connection obterConexao() {
		
		//Objeto Connection
		Connection con = null;
		
		//Tentativa
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/trabalho","root","");
			
			
		}catch(Exception e) {
			System.out.println("falha ao conectar "+e.getMessage());
		}
		
		
		//retorno
		return con;
	}
	
}
