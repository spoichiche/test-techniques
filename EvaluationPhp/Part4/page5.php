<?php

if(file_exists("Test.txt")){

	$input = fopen("Test.txt", "r") or die("erreur d'ouverture de fichier");
	$output = fopen("Testcopie.txt", "w") or die("erreur d'ouverture de fichier");

	$i = 0;
	while(!feof($input)){
		$line = fgets($input);
		fputs($output, $line);
		echo $line."copiée <br>";
		$i++;
	}
	echo "<hr> Copie réussie" ;

	fclose($output);
	fclose($input);
} else die("fichier introuvable");

?>