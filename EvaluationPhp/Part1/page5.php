<?php 
if (isset($_GET["name"]) && isset($_GET["nb1"]) && isset($_GET["nb2"])) {

	if(is_numeric($_GET["nb1"]) && is_numeric($_GET["nb2"])) {

		if($_GET["nb1"] == $_GET["nb2"]) {
			echo "les deux nombres ont la même valeur.";
		} else {
			echo 	"le nombre le plus grand est ".
					max([$_GET["nb1"], $_GET["nb2"]]).
					", et le nombre le plus petit est ".
					min([$_GET["nb1"], $_GET["nb2"]]);
		}
	} else {
		echo "Vous n'avez pas saisit deux nombres : recommencez svp";
	}
}
?>