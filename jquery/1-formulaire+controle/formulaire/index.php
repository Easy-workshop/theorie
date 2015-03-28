<?php


$bdd = new PDO('mysql:host=localhost;dbname=jquery', 'root', '');
$bdd->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING);
$bdd->exec('SET NAMES utf8');

if(!empty($_POST))
{
  
  extract($_POST);
  $nom = strip_tags($nom);
  $email = strip_tags($email);
  $message = strip_tags($message);

  $errors = array();
  if(empty($nom)){
    array_push($errors, 'Indiquez votre nom');
  }
  if(!filter_var($email, FILTER_VALIDATE_EMAIL)){
    array_push($errors, 'Indiquez un email valide');
  }
  if(empty($message)){
    array_push($errors, 'Indiquez votre message');
  }

  if(count($errors) == 0)
  {
  }
}


$req = $bdd->prepare('SELECT * FROM message');
$req->execute();
$message = $req->fetchAll(PDO::FETCH_OBJ);
$req->closeCursor();
?>

<html>
<head>
<link rel="stylesheet" href="dist/css/bootstrap.css" />
<link rel="stylesheet" href="dist/css/mystyle.css" />
</head>

<body>
<div class="container">
    
	<div id="message">

<?php if($message):
     foreach($message as $c):?>
      <h4><?=$c->nom;?></h4>
      <p><?=nl2br($c->message);?></p>
    <?php endforeach; endif;?>
     </div>
	
<div class="alert alert-danger">
     <?php foreach($errors as $e):?>
      <p><?=$e;?></p>
     <?php endforeach;?>
     </div>

     <?endif;?>

     <?php if(isset($success)):?>
      <div class="alert alert-success"><?=$success;?></div>
     <?php endif;?>	 
<form id="form" action="index.php" method="post">
	
	<input type="text" name="nom" id="nom" placeholder="nom" class="form-control">
	<br/>
	
	<input type="text" name="titre" id="titre" placeholder="titre" class="form-control">
	<br/>
	
	<input type="text" name="email" id="email" placeholder="email" class="form-control">
	<br/>
	
	
	<textarea name="message" id="message" placeholder="votre message" class="form-control">
	
	</textarea>
	<br/>
	<input type="submit" id="submit" class="btn btn-primary" value="Envoyer">
	</form>

</div>  <!--container-->


<script type="text/javascript" src="dist/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="dist/js/bootstrap.js"></script>
<script type="text/javascript" src="dist/js/myscript.js"></script>
</body>
</html>