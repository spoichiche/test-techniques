<!doctype html>
<html lang="fr">
<head>
  <meta charset="utf-8">
  <title>page6</title>
</head>

<body>

	<?php 
	if(isset($_GET["filename"])){
		$filename = $_GET["filename"];

		if(file_exists($filename)){
			unlink($filename) or die("erreur lors de la suppression du fichier");
			echo "Le fichier ".$filename." a été supprimé";
		} else {
			echo "Le fichier ".$filename." est introuvable";
		}
		
	}
	?>
	
	<form method="GET" action="page6.php"> 
		<label for="filename">Nom du fichier a supprimé :</label>  
		<input type="text" name="filename"/><br>
		<input type="submit" name="envoi" value="Envois" />
	</form>

</html>