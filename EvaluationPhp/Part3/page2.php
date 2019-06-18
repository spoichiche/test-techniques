<?php

function compare($nb1, $nb2){
	if($nb1 == $nb2){
		echo "nb1 est égale à nb2";
	}
	elseif ($nb1 > $nb2){
		echo "nb1 est plus grand que nb2";
	}
	elseif ($nb1 < $nb2){
		echo "nb1 est plus petit que nb2";
	}
}

compare(5, 5);
echo "<hr>";
compare(3, 5);
echo "<hr>";
compare(5, 3);
?>