<?php 
$i = 1;
for($i; $i < 100; $i = $i+2){
	echo $i."-";
}

echo "<hr>";
$i = 1;
while($i<100){
	echo $i."-";
	$i = $i+2;
}

echo "<hr>";
$i = 100;
for($i; $i > 1; $i = $i-2){
	echo $i."-";
}

echo "<hr>";
$i = 100;
while($i>1){
	echo $i."-";
	$i = $i-2;
}

?>