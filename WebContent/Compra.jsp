<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%@ include file="topo.jsp" %>
	
	<script>
	
		function validarCPF(cpf){
			var filtro = /^\d.\d.\d-\d$/i;

				if(!filtro.test(cpf)){
				window.alert("CPF inválido. Por favor corrija.");

		return false;
		}
	
	</script>
	
</head>
<body>

	<form class="formularioTransporte">
	<input type="text" placeholder="Nome no Cartão">
	<input type="text" placeholder="Nº Cartão" onclick="validarCPF(cpf)" >
	<input type="text" placeholder="Validade">
	<input type="text" placeholder="Codigo de Segurança">
	<a href=transporte.jsp?><button class="botaozaobao">Enviar</button></a>
	</form>
	
		<br><input type="checkbox" class="cbox2">Cielo<img src="imagens/cielo.png" class="cielo"><br>
		<br><input type="checkbox" class="cbox3">Mastercard<img src="imagens/mastercard.png" class="mastercard"><br>
	 
</body>

	<%@ include file="footer.jsp" %>

</html>