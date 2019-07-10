<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%@ include file="topo.jsp" %>

	<!-- Mensagem -->
	<%@ include file="mensagem.jsp" %>

	<link rel="stylesheet" href="css/estilos.css">

	<script>

/*Mascara para CEP*/
	function mascara(t, mask){
		var i = t.value.length;
 		var saida = mask.substring(1,0);
 		var texto = mask.substring(i)
		if (texto.substring(0,1) != saida){
 		t.value += texto.substring(0,1);
 		}
 		}
 
	function myalert() { 
    	alert("Compra efetuada com sucesso.\n " + 
        	"Agradeçemos sua compra! Volte sempre!");   
} 
	
	</script>

<body>

	<form class="formularioTransporte">
	<input type="text" placeholder="CEP" name="cep" onkeypress="mascara(this, '#####-###')" maxlength="9">
	<input type="text" placeholder="Estado">
	<input type="text" placeholder="Cidade">
	<input type="text" placeholder="Bairro">
	<input type="text" placeholder="Rua">
	<input type="text" placeholder="Nº Casa">	
 	<input type="text" placeholder="Complemento">
 	<a href=Livros.jsp?mensagem=compraFeita><button onclick="myalert()" type="button" class="botaozaobao">Enviar</button></a>
	</form>

</body>

	<!-- Footer -->
	<%@ include file="footer.jsp" %>

</html>