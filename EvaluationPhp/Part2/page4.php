<!doctype html>
<html lang="fr">
<head>
  <meta charset="utf-8">
  <title>2.4</title>
</head>

<body>

	<table>
		<?php

		for($i = 0; $i < 10; $i++){
			echo "<tr>";
			for($j = 1; $j <= 10; $j++){
				echo "<td>";
				echo ($i*10)+$j;
				echo "</td>";
			}
			echo "</tr>";
		}

		?>
	</table>
	<hr>
	<table>
		<?php
		$i = 0;
		while($i < 10){
			echo "<tr>";
			$j = 1;
			while($j <= 10){
				echo "<td>";
				echo ($i*10)+$j;
				echo "</td>";
				$j++;
			}
			echo "</tr>";
			$i++;
		}
		
		?>
	</table>

</body>

</html>