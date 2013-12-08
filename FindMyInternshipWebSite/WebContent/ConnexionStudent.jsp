<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de Connexion</title>
</head>
	<body>
	<h1>Bienvenue sur le site Find My Insternship</h1>
		<form method="post" action="traitement.php">
	 
		  	 <fieldset>
		       	<legend>Vos coordonnées</legend> <!-- Titre du fieldset --> 
				<br/>
		      	 <label for="login">Login</label>
		       	<input type="text" name="login" id="login" />
		
		       	<label for="pwd">Password</label>
		      	 <input type="text" name="pwd" id="pwd" />
		   	</fieldset>
		   	
		   	<input type="button" name="inscription" value="inscription" onclick="self.location.href='Inscription.jsp'" style="background-color:#3cb371" style="color:white; font-weight:bold"onclick/> 
	 
		</form>
	</body>
</html>