<?php
$a="bonjour1";
$b="bonjour2";
$c="bonjour3";
$d="bonjour4";
$e="bonjour5";
$f="bonjour6";
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
			<td><?php echo $a; ?></td>
			<td><?php echo $b; ?></td>
		</tr>
		<tr>
			<td><?php echo $c; ?></td>
			<td><?php echo $d; ?></td>
		</tr>
		<tr>
			<td><?php echo $e; ?></td>
			<td><?php echo $f; ?></td>
		</tr>
	</table>
</body>
</html>