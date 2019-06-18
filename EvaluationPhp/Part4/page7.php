<?php

$structure = "dossier";

mkdir($structure) or die("Erreur dans la création du dossier");

rmdir($structure) or die("Erreur dans la suppression du dossier");

?>