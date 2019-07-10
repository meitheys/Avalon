package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.ProdutoBean;
import conexao.Conexao;

public class ProdutoDao {

	//Obter dados
		public ProdutoBean obterDados(int idProduto) {
			
			//Objeto ProdutoBean
			ProdutoBean obj = new ProdutoBean();
					
			//Conexão
			Connection conexao = Conexao.obterConexao();	
					
			try {
				String sql = "SELECT * FROM produtos WHERE idProduto = ?";
				
				PreparedStatement pstmt = conexao.prepareStatement(sql);
				pstmt.setInt(1, idProduto);
				
				ResultSet rs = pstmt.executeQuery();
				rs.last();
				
				obj.setIdProduto(rs.getInt(1));
				obj.setNomeProduto(rs.getString(2));
				obj.setValorProduto(rs.getDouble(3));
				obj.setIdDepartamento(rs.getInt(4));
				obj.setIdMarca(rs.getInt(5));

				pstmt.close();
				conexao.close();
			}catch(Exception erro) {}
			//Retorno		
			return obj;
			
		}

		//Selecionar
		public String selecionarInformatica() {
		
		//Estrutura
		String estrutura = "";
			
	
		
		//Conexao
		Connection conexao = Conexao.obterConexao();
		
		//Tentativa
		try {
			String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE departamento.nomeDepartamento = 'Informatica'";
			
			Statement stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			  
			while(rs.next()) {
				estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
					estrutura += "<img src='"+rs.getString(6)+"'>"; 
					estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
					estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
					estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
					estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
					estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
					
					
				estrutura += "</div>";
			}
		
 
			stmt.close();
			conexao.close();
			
		}catch(Exception e) { System.out.println(e.getMessage());}
		
		
		//retorno
		return estrutura;
	}
		//Selecionar
		public String selecionarEletrodomesticos() {
				
		//Estrutura
		String estrutura = "";
					
			
				
		//Conexao
		Connection conexao = Conexao.obterConexao();
				
		//Tentativa
		try {
			String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE departamento.nomeDepartamento = 'Eletrodomesticos'";
					
			Statement stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
					  
			while(rs.next()) {
				estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
					estrutura += "<img src='"+rs.getString(6)+"'>"; 
					estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
					estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
					estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
					estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
					estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
					
					 
				estrutura += "</div>";
				}
				
		 
				stmt.close();
				conexao.close();
					
		}catch(Exception e) { System.out.println(e.getMessage());}
				
				
		//retorno
		return estrutura;
	}
		//Selecionar
		public String selecionarLivros() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE departamento.nomeDepartamento = 'Livros'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>"; 
							
							 
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
		//Selecionar
				public String selecionarAutomotivo() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE departamento.nomeDepartamento = 'Automotivo'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarSamsung() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Samsung'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}	
				//Selecionar
				public String selecionarEVGA() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'EVGA'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarXiaomi() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Xiaomi'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarRazer() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Razer'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarCorsair() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Corsair'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarMAX() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'MAX'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarBrastemp() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Brastemp'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarEletrolux() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Eletrolux'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarMotoIII() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'MotoIII'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionar7DRIVER() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = '7DRIVER'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarMultiGear() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'MultiGear'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarJBL() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'JBL'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarDelinte() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Delinte'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarTodoLivro() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Todo Livro'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
				//Selecionar
				public String selecionarAutentica() {
						
				//Estrutura
				String estrutura = "";
							
					
						
				//Conexao
				Connection conexao = Conexao.obterConexao();
						
				//Tentativa
				try {
					String sql= "SELECT produtos.idProduto, produtos.nomeProduto, produtos.valorProduto, departamento.nomeDepartamento, marcas.nomeMarca, produtos.imagem FROM produtos INNER JOIN departamento ON produtos.idDepartamento = departamento.idDepartamento INNER JOIN marcas ON  produtos.idMarca = marcas.idMarca WHERE marcas.nomeMarca = 'Autêntica'";
							
					Statement stmt = conexao.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
							  
					while(rs.next()) {
						estrutura += "<div onclick='adicionarProduto("+rs.getInt(1)+",\""+rs.getString(2)+"\","+rs.getInt(3)+")'>";
							estrutura += "<img src='"+rs.getString(6)+"'>"; 
							estrutura += "<input type='hidden'value='"+rs.getInt(1)+"'>";
							estrutura += "<p><h3>"+rs.getString(2)+"</h3><br>";
							estrutura += "<h4>R$"+rs.getDouble(3)+"</h4><br>";
							estrutura += "<input type='hidden'value='"+rs.getString(4)+"'>";
							estrutura += "<h5>"+rs.getString(5)+"</h5></p>";
							
							
						estrutura += "</div>";
						}
						
				 
						stmt.close();
						conexao.close();
							
				}catch(Exception e) { System.out.println(e.getMessage());}
						
						
				//retorno
				return estrutura;
			}
	}