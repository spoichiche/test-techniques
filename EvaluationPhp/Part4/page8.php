<?php 
function is_csv($filename){
	$extension = ".csv";
	$len = strlen($extension);
    return (substr($filename, - $len) === $extension); 
}
?>

<!doctype html>
<html lang="fr">
<head>
  <meta charset="utf-8">
  <title>page8</title>
</head>

<body>

	<?php 
	if(isset($_GET["filename"])){

		$filename = $_GET["filename"];

		if(is_csv($filename) && file_exists($filename)){

			$handler = fopen($filename, 'r') or die("Erreur dand l'ouverture du fichier");
			$i = 0;
			while(!feof($handler)){
				$line = fgets($handler);
				$tab[$i] = explode(';',$line);
				$i++;
			}

			print_r($tab);

		} else echo "Le fichier n'est pas un fichier csv ou est introuvable.";
	}
	?>
	
	<form method="GET" action="page8.php"> 
		<label for="filename">Nom du fichier csv :</label>  
		<input type="text" name="filename"/><br>
		<input type="submit" name="envoi" value="Envois" />
	</form>

</html>