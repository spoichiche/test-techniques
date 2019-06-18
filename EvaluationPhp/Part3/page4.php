<?php
// on spécifie le type de document que l'on va créer (ici une image au format PNG
header ("Content-type: image/png");

// on dessine une image vide de 200 pixels sur 100
$image = @ImageCreate (500, 500) or die ("Erreur lors de la création de l'image");

$centerX = 250;
$centerY = 250;
$size = 400;

$backgroundColor = imagecolorallocate($image, 255, 255, 255);
imageellipse($image, $centerX, $centerY, $size, $size, imagecolorallocate($image, 0, 0, 0));
imageellipse($image, ($centerX-$size/4), ($centerY-$size/4), $size/5, $size/5, imagecolorallocate($image, 0, 0, 0));
imageellipse($image, ($centerX+$size/4), ($centerY-$size/4), $size/5, $size/5, imagecolorallocate($image, 0, 0, 0));
imageellipse($image, $centerX, ($centerY+$size/3), $size/3, $size/3, imagecolorallocate($image, 0, 0, 0));

imageline($image, ($centerX-$size/8), $centerY, ($centerX+$size/8), $centerY, imagecolorallocate($image, 0, 0, 0));
imageline($image, $centerX, ($centerY-$size/8), $centerX, ($centerY+$size/8), imagecolorallocate($image, 0, 0, 0));

// on dessine notre image PNG
ImagePng ($image);
?>