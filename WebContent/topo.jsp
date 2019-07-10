<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avalon</title>
	
	<script>
	
	//Cadastrar produto
	function adicionarProduto(id, nome, valor) {
			
	//Caso não haja vetor no localStorage, será criado e adicionado o primeiro produto
		if(localStorage.getItem("carrinho") == null){
				
	//Vetor
			var vetor = [];
				
	//Objeto
			var compra = new Object(); 
				compra["id"]  = id,
				compra["nome"] = nome,
				compra["valor"] = valor,	
				compra["botao"] = document.createElement("button");
				compra["quantidade"] = 1
					
	//Cadastrar produto no vetor
				vetor.push(compra);
					
	//Adicionar vetor no localStorage
				localStorage.setItem("carrinho",JSON.stringify(vetor));
	
			}else{
				
	//Obter os dados do vetor
				var vetor = JSON.parse(localStorage.getItem("carrinho"));
				
	//Verificar se o produto já existe
			if(existeProduto(id) == -1){
				
	//Objeto
				var compra = new Object(); 
					compra["id"]  = id,
					compra["nome"]  = nome,
					compra["valor"]  = valor,
					compra["botao"] = document.createElement("button");
					compra["quantidade"] = 1
						
	//Cadastrar produto no vetor
						vetor.push(compra);
				
			}else{
	//Objeto
					var compra = new Object(); 
						compra["id"]  = id,
						compra["nome"]  = nome,
						compra["valor"]  = valor,
						compra["botao"] = document.createElement("button");
						compra["quantidade"] = parseInt(vetor[existeProduto(id)]["quantidade"])+1;
						
						vetor.splice(existeProduto(id), 1, compra);					
				}
				
	//Adicionar vetor no localStorage
				localStorage.setItem("carrinho",JSON.stringify(vetor));
				}
			
	//Atualizar lista
			exibirProdutos();		
		}
		 
	//Verificar se o produto existe no carrinho
		function existeProduto(id){
			
	//Índice
			var retornarIndice = -1;
			
	//Obter os dados do vetor
			var vetor = JSON.parse(localStorage.getItem("carrinho"));
			
			for(var indice=0; indice < vetor.length; indice++){
				if(vetor[indice]["id"] == id) {
					retornarIndice = indice;
					break;
				}
			}
			
			return retornarIndice;
			
		}
		
		
	//Exibir produtos
		function exibirProdutos(){
			
	//Obter os produtos adquiridos
			var vetor = JSON.parse(localStorage.getItem("carrinho"));
			
			if(vetor != null){
				
	//Obter a listagem de produtos
			var lista = document.getElementById("lista");
			
	//Limpar lista
			lista.innerHTML = "";
			
	//Tabela
			var tabela = document.getElementById("lista");
			
	//Exibir os produtos adquiridos
			for(var indice=0; indice<vetor.length; indice++){
				
				var linha = tabela.insertRow(-1);

				var coluna1 = linha.insertCell(0);
				var coluna2 = linha.insertCell(1);
				var coluna3 = linha.insertCell(2);
				var coluna4 = linha.insertCell(3);
				var coluna5 = linha.insertCell(4);

					coluna1.innerHTML=vetor[indice]["id"];
					coluna2.innerHTML=vetor[indice]["nome"];
					coluna3.innerHTML=vetor[indice]["valor"];
					coluna4.innerHTML=vetor[indice]["quantidade"]; 
					coluna5.innerHTML= "<button class='btn btn-secondary' onClick='excluir("+vetor[indice]["id"]+")'>Excluir</button>";			
				}
			}
					
		}
		
		window.onload = function(){
			exibirProdutos();
			
		}
		 
		var carrinhoAberto = false;
		function carrinhoCompras() {
			if(carrinhoAberto == false){
				carrinhoAberto = true;
				document.getElementById("barraListagem").style.right = "0px";
			}else{ 
				carrinhoAberto = false;
				document.getElementById("barraListagem").style.right = "-800px";
			}
			
		}
		
		function excluir(id) {
	
	//Obter os produtos adquiridos
			var vetor = JSON.parse(localStorage.getItem("carrinho"));
			
	//Verifica a qtd de itens do vetor
			for(var indice=0; indice<vetor.length; indice++){
				
				if(vetor[indice]["id"] == id){
					if(vetor[indice]["quantidade"] == 1){
						vetor.splice(indice,1);
					}else{
						vetor[indice]["quantidade"]= (vetor[indice]["quantidade"]-1);
					}
				}
				
			}
						
	//Adicionar vetor no localStorage
			localStorage.setItem("carrinho",JSON.stringify(vetor));
			
	//Atualizar lista
			exibirProdutos();
		}
				
	</script>
	
	
	<link rel="icon" href="imagens/logo.png" />	
	
	 <!-- Fotorama -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <link  href="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js"></script>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

	<!--  CSS -->
	<link rel="stylesheet" href="css/estilos.css">

</head>

<body>

	<div id="barraListagem">
		<table id="lista">
			
		</table>
		<a href="Login.jsp"><button  type="button" class="btn btn-secondary">Finalizar Compra</button></a>
	</div>


<!-- Topo -->
<header>
	<a href ="inicio.jsp"><img src="imagens/logo.png"/></a>	
	
	<div class="btn-group" role="group" aria-label="Button group with nested dropdown">


  	<div class="btn-group" role="group">
    	<button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      	Departamentos
    	</button>
    		<div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
      			<a class="dropdown-item" href="informatica.jsp">Informatica</a>
      			<a class="dropdown-item" href="eletrodomesticos.jsp">Eletrodomesticos</a>
      			<a class="dropdown-item" href="Livros.jsp">Livros</a>
      			<a class="dropdown-item" href="automotivo.jsp">Automotivo</a>
    		</div>
  		</div>
	</div>

	<!-- Search form -->
	<input class="form-control" type="text" placeholder="Search" aria-label="Search">

	<nav>
		<a href ="#" onClick="carrinhoCompras()"><img src="imagens/cart.png"/></a>
	</nav>
		
</header>
