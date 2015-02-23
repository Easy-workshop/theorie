<?php
$dbhost='localhost';
$dbname='ajax';
$dbuser='root';
$dbpass='';
$conn = mysql_pconnect($dbhost,$dbuser,$dbpass);

//include_once(../Scripts/connect.php);

mysql_select_db($dbname,$conn);
mysql_query("SET NAMES 'utf8'");
$sql ="SELECT * FROM rubriques ORDER BY ch_rub_id ASC";
$rubs=mysql_query($sql);


?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Document sans nom</title>
<link href="../Styles/layout.css" rel="stylesheet" type="text/css">
<link href="../Styles/display.css" rel="stylesheet" type="text/css">
<link href="../Styles/infos.css" rel="stylesheet" type="text/css">

<script src="galerie.js" type="text/javascript"></script>

</head>
<body onLoad="charge_galerie()">
<div id="header">
  <h1>Galerie d'image</h1>
</div>
<div id="sidebar">
  <h2>Catégorie</h2>
  <select id='categorie' name='categorie' onchange="charge_galerie(this.options[this.selectedIndex].value)">
  
  <option value='none'>Sélectionnez une catégorie...</option>
  
     <?php
	 
	 while($rub = mysql_fetch_assoc($rubs)){
	 echo "<option value='" .$rub['ch_rub_folder']."'>" .$rub['ch_rub_label']."</option>";
	 }
	 
	 ?>
  </select>
  
  <div id="informations">
  <h2>informationS</h2>
<img id="infos_thumb"src="../images/Calenques/g1.jpg" width="88" height="58" alt="thumb"/>
<p id="ch_img_id">25</p>
<p id="ch_img_rubId">Calenque</p>
<p id="ch_img_titre">titreG1</p>
<p id="ch_img_sousTitre">soustitreg1</p>
<hr />
<p id="ch_img_description">descg1</p>
<p id="ch_img_texte">textg1</p>
<hr />
<p id="ch_img_large">450</p>
<p id="ch_img_haut">299</p>
<hr />
<p id="ch_img_orientation">Paysage</p>
<p id="ch_img_fichier">g1.txt</p>
<p id="ch_img_keywords">keywordg1</p>
  </div>
  
  
  
  
  
  </div>
<div id="maincontent">
  <h2>planche contact</h2>
  <div id="planche-contact">    
  </div>
</div>
<div id="footer">
  <p>ajax par la pratique</p>
  <p>video2brain</p>
  <p>Yassine</p>
  <p>Trainninig chap01</p>
</div>
</body>
</html>
