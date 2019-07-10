package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.UsuarioBean;
import conexao.Conexao;

public class UsuarioDao {

	//Validar Login
	
		public int validarLogin(String Usuario, String Senha) {

	//Contador
		
		int contador = 0;
		
	//Obter conexao
		
		Connection conexao = Conexao.obterConexao();
		
		try {
			String sql = "SELECT COUNT(*) FROM usuariostrab WHERE Usuario=? AND senhaUsuario=?";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setString(1, Usuario);
			pstmt.setString(2, Senha);
			
			ResultSet rs = pstmt.executeQuery();
								
			rs.last(); 
		
			contador = rs.getInt(1);
			
			System.out.println(Usuario+" | "+Senha);
			
		}catch(Exception erro) {
			System.out.println("Falha ao validar o usuário "+erro.getMessage());
		}
		
		return contador;

		}
		
	//Obter dados do usuário
		
		public UsuarioBean obterDados(String Usuario, String Senha) {
			
			//Objeto UsuarioBean
			UsuarioBean usuarioBean = new UsuarioBean();
			
			//Conexão
			Connection conexao = Conexao.obterConexao();
			
			//Tentativa
			try {
				
				String sql = "SELECT * FROM usuariostrab WHERE Usuario=? AND senhaUsuario=?";
				
				PreparedStatement pstmt = conexao.prepareStatement(sql);
				pstmt.setString(1, Usuario);
				pstmt.setString(2, Senha);
				
				ResultSet rs = pstmt.executeQuery();
				
				rs.last();
				
				usuarioBean.setIdUsuario(rs.getInt(1));
				usuarioBean.setUsuario(rs.getString(2));
				usuarioBean.setSenha(rs.getString(3));
							
			}catch(Exception erro) {
				System.out.println("Falha ao obter os dados "+erro.getMessage());		
			}
			
			//Retorno
			return usuarioBean;
				
		}

	//Adicionando ao SQL

		public boolean cadastrar(String Usuario, String Senha, String Email, String CPF) {
			
			Connection conexao = Conexao.obterConexao();
			
			boolean valida = false;
			
			try {
				String sql = "INSERT INTO usuariostrab (Usuario, senhaUsuario, emailUsuario, cpfUsuario) VALUES (?,?,?,?)";
				
				PreparedStatement pstmt = conexao.prepareStatement(sql);
				
				pstmt.setString(1, Usuario);
				pstmt.setString(2, Senha);
				pstmt.setString(3, Email);
				pstmt.setString(4, CPF);
				pstmt.execute();
				
				pstmt.close();
				conexao.close();
				
				valida = true;
							
			}catch(Exception erro) {
				System.out.println("Falha ao validar o usuário "+erro.getMessage());
			}
				
			return valida;
			
			}
		

}
