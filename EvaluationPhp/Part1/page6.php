<?php 
if (isset($_GET["nom"])) {

	if(strtolower($_GET["nom"]) == "dupond"){
		echo "Bravo M. Dupond, vous avez gagné.";
	} else {
		echo "Désolé M. ".$_GET["nom"].", vous avez perdu.";
	}
}

?>