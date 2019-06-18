<?php

if(file_exists("TestNumber.txt")){

	$handler = fopen("TestNumber.txt", "r");

	$i = 0;
	while(!feof($handler)){
		$line = fgets($handler);
		$tab[$i] = intval($line);
		$i++;
	}

	foreach($tab as $val){
		echo "<br>".$val;
	}

	fclose($handler);
} else die("fichier introuvable");

?>