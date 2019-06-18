<?php

if(!file_exists("Bonjour.txt")){

	$handler = fopen("Bonjour.txt", "w") or die("Erreur d'ouverture du fichier");

	fwrite($handler, "Bonjour");

	fclose($handler);

	echo "fichier Bonjour.txt créé";
} else die("fichier déjà existant");

?>