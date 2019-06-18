<?php
/*CREATE TABLE `exemple` (
  `description` varchar(150) NOT NULL default '');
*/
// si formulaire envoyé
if(isset($_POST['description'])) {  
	// connexion à la base de données
	$bdd = mysql_connect('localhost', 'root', 'damien')
			or die("Impossible de se connecter à la base de données");
	mysql_select_db('test', $bdd) 
		or die("Impossible de sélectionner la base de données");

	// protection des données
	$description = mysql_real_escape_string($_POST['description']);

	// insertion des données
	$sql = "INSERT INTO `exemple` (`description`) VALUES ('".$description."')";
	mysql_query($sql, $bdd);

	// fin  
	mysql_close($bdd);
}
?>