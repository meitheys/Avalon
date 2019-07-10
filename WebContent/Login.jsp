<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 
	<link rel="stylesheet" href="css/estilos.css">
	
	<script>

	/*Exibir ou não a senha*/
	function myFunction() {
		var x = document.getElementById("myInput");
		 if (x.type === "password") {
		    x.type = "text";
		 } else {
		    x.type = "password";
		 }
	}
	
	</script>
	
<body>

	<div class="div">
	
	<!-- Formulario -->
	<form class="formularioCadastro" action="requisicoes/logar.jsp" method="post">
		
	<p>Efetue Login</p>
		<input type="text" placeholder="Usuario" name="usuario" >
		<input type="password" placeholder="Senha" name="senha" id="myInput">
		<input type="submit" placeholder="Logar">	
			<a class="hrefLogar" href="Cadastro.jsp">Não tem conta? Registre-se</a> 
	</form>
		<input type="checkbox" class="checkbx" onclick="myFunction()">Mostrar senha
	</div>

</body>

	<!-- Footer -->
	<%@ include file="footer.jsp" %>
	
</html>