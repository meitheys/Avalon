<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="conexao.Conexao"%>

	<link rel="icon" href="imagens/logo.png"/>	
	
	<%@ include file="topo.jsp" %>

	<!--  CSS -->
	<link rel="stylesheet" href="css/estilos.css">
	
	<!-- Banner --> 
    <section class="fotorama" data-width="100%" data-loop="true" data-autoplay="true" >
        <img src="imagens/banners/imagem01.png">
        <img src="imagens/banners/imagem02.png">
        <img src="imagens/banners/imagem03.png">
    </section> 
   
	
	
	<section class="produtos">
		<div>
		<img src="imagens/produtos/imagem1.png">
		<p><h5>Celular Xiaomi Mi 8 LITE 12Mp</h5><br> R$ 1,200 à vista<br> ou até 10x de R$ 139,00</p>
		</div> 
		
		<div>
		<img src="imagens/produtos/imagem2.png">
		<p><h5>Computador Gamer GTX 1060 TI</h5><br> R$ 1,800 à vista<br> ou até 8x de R$ 255,00</p>
		</div>
		
		<div>
		<img src="imagens/produtos/imagem3.png">
		<p><h5>Fogão Eletrico 5 bocas com forno</h5><br> R$ 800 à vista<br> ou até 5x R$ 16</p>
		</div>
		
		<div>
		<img src="imagens/produtos/imagem4.png">
		<p><h5>Celular Galaxy S9 20Mp</h5><br> R$ 2,900 à vista<br> ou até 12x de R$ 290,00</p> 
		</div>
		
	</section>

</body>

	<%@ include file="footer.jsp" %>

</html>
