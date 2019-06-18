<?php 

if(isset($_GET["start"]) && isset($_GET["end"]) && isset($_GET["step"])){
	
	if(is_numeric($_GET["start"]) && is_numeric($_GET["end"]) && is_numeric($_GET["step"])){
		$start = intval($_GET["start"]);
		$end = intval($_GET["end"]);
		$step = intval($_GET["step"]);

		if(($start != $end) && ($step>0)){
			
			if($start < $end){

				$i = $start;
				echo $i;
				for($i+=$step; $i < $end; $i+=$step){
					echo "-".$i;
				}

				echo "<hr>";
				$i = $start;
				do{
					echo $i."-";
					$i += $step;
				}while($i < $end);

			} else {

				$i = $start;
				echo $i;
				for($i-=$step; $i > $end; $i-=$step){
					echo "-".$i;
				}

				echo "<hr>";
				$i = $start;
				do{
					echo $i."-";
					$i -= $step;
				}while($i > $end);

			}
			
		} else die("Valeur incorrecte : Valeur de début et de fin doivent être différente,
					le pas doit être > 0");		
	} else die("Valeur non numérique");
} else die("Valeur non définie");

?>