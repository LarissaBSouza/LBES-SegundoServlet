<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Maven -->
	<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
	
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	
	<form method="post" action="Calculadora">
		<div class="container col-8 mt-4 mb-4 text-center">
			<h1>..:::: Calculadora de Triângulos ::::..</h1>
			<div class="row">
  					<div class="col">
    					<input type="text" class="form-control" placeholder="Valor Lado A" aria-label="Valor 1" name="val1" required>
  					</div>
  					<div class="col">
    					<input type="text" class="form-control" placeholder="Valor Lado B" aria-label="Valor 2" name="val2" required>
  					</div>
  					<div class="col">
  						<input type="text" class="form-control" placeholder="Valor Lado C" aria-label="Valor 3" name="val3" required>
  					</div>
			</div>
			<div class="container row align-items-center mt-2 mb-2 buttons">
				<div class="col-6">
    				<button type="reset" class="btn btn-warning">Limpar</button>
  				</div>
				<div class="col-6">
    				<button type="submit" class="btn btn-warning">Somar</button>
  				</div>
  			</div>
		</div>
	</form>
</body>
</html>