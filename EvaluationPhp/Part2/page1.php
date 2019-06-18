<?php 
$i = 1;
for($i; $i < 100; $i++){
	echo $i."-";
}
echo $i;

echo "<hr>";
$i = 1;
while($i<100){
	echo $i++."-";
}
echo $i;

echo "<hr>";
$i = 100;
for($i; $i > 1; $i--){
	echo $i."-";
}
echo $i;

echo "<hr>";
$i = 100;
while($i>1){
	echo $i--."-";
}
echo $i;

?>