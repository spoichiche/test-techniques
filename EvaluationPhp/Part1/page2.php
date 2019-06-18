<?php
$tab=array("bonjour1","bonjour2","bonjour3",
			"bonjour4","bonjour5","bonjour6");
?>

<!doctype html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>page2</title>
	<style type="text/css">
		td{ border: double; }
	</style>

</head>
<body>
	<table>
		<tr>
			<td><?php echo $tab[0]; ?></td>
			<td><?php echo $tab[1]; ?></td>
		</tr>
		<tr>
			<td><?php echo $tab[2]; ?></td>
			<td><?php echo $tab[3]; ?></td>
		</tr>
		<tr>
			<td><?php echo $tab[4]; ?></td>
			<td><?php echo $tab[5]; ?></td>
		</tr>
	</table>
</body>
</html>