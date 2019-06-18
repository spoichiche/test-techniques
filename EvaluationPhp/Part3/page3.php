<?php

function ajouteMAJ($ch1, $ch2, $ch3){
	return strtoupper($ch1).strtoupper($ch2).strtoupper($ch3);
}

echo ajouteMAJ("bonjour", " a ", "tous");
?>