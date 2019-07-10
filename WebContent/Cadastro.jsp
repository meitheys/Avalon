<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%@ include file="topo.jsp" %>

<body>
	
	<div class="div">
	
	<!-- Formulario -->
	<form class="formularioCadastro" action="requisicoes/cadastrar.jsp" method="post">
		<input type="text" placeholder="Usuario" name="usuario" class="Usuario">
		<input type="text" placeholder="E-mail" name="email" class="email">
		<input type="text" placeholder="Senha" name="senha" class="Senha">
		<input type="text" placeholder="CPF" name="cpf" class="CPF">
		<input type="submit" placeholder="Cadastrar">	
	</form>
	
	</div>
	
	<section class="termos">
	<p>Termos de uso</p>
	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus iaculis purus diam, sit amet congue lectus facilisis a. Donec vestibulum, enim in eleifend dignissim, quam nibh mollis lectus, eget porta nibh mauris dictum diam. Fusce non nunc porttitor, fermentum mauris vitae, luctus arcu. Suspendisse potenti. Mauris molestie, purus eu pellentesque maximus, lacus eros consequat tortor, eget lacinia leo metus suscipit urna. Nunc et lacus quis turpis maximus consequat at ultricies lorem. Nullam metus tellus, placerat in dui at, cursus iaculis sem. Pellentesque ac massa et lorem aliquam hendrerit. Aliquam aliquam eros nec purus laoreet, scelerisque porta elit tempor. Ut porttitor.</p>
	</section>
	
		<input type="checkbox" name="check" value="true" class="check"> Aceito os termos de uso<br>

</body>
	
	<%@ include file="footer.jsp" %>

</html>