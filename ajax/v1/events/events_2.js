function set_up(){
var div = document.getElementById('conteneur')
var p = document.getElementById('contenu')

	 div.addEventListener('click',conteneur,true) 
	 p.addEventListener('click',contenu,false)
	
	 
     
 
}

function conteneur(){
alert("clique sur le conteneur")
}

function contenu(){
alert("clique sur le contenu")
}

window.onload = set_up