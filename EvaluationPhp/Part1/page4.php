<?php 
if (isset($_GET["age"]) && isset($_GET["name"])) {
	if($_GET["age"]>= 18){
		echo "Bonjour M. ".$_GET["name"].", vous avez plus de 18 ans.";
	} else {
		echo "Bonjour M. ".$_GET["name"].", vous avez moins de 18 ans.";
	}
}
?>