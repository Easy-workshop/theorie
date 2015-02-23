<?php
$dbhost='localhost';
$dbname='ajax';
$dbuser='root';
$dbpass='';
$conn = mysql_pconnect($dbhost,$dbuser,$dbpass);
mysql_select_db($dbname,$conn);
mysql_query("SET NAMES 'utf8'");

$ch_img_rubId =$_GET['ch_img_rubId'];
//echo ($ch_img_rubId);
$ch_img_rubId="Calenques";
$sql ="SELECT * FROM `images` WHERE `ch_img_rubId`='".$ch_img_rubId."'";


$categorie = mysql_query($sql);

while ($image =mysql_fetch_assoc($categorie)) {
echo $image['ch_img_fichier']. "\n";
}






?>