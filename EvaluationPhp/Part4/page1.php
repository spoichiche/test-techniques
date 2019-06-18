<?php

if(file_exists("Test.txt")){

	$handler = fopen("Test.txt", "r");

	$i = 0;
	while(!feof($handler)){
		$line = fgets($handler);
		if($i%2 == 0) echo $line."<br>";
		$i++;
	}
	echo "<hr> Le fichier contient ".$i." lignes" ;

	fclose($handler);
} else die("fichier introuvable");

?>