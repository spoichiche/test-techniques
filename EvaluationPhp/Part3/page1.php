<?php

function ecrire_bonjour(){
	echo "bonjour";
}

for($i=0;$i<10;$i++){
	ecrire_bonjour();
}
echo "<hr>";
$i = 0;
while($i<10){
	ecrire_bonjour();
	$i++;
}
?>