function explore_json(){
var json={ "diapositives":
             [
               {"item":{"nom_fichier":"g1.jpg","orientation":"Portrait"}},			 
               {"item":{"nom_fichier":"g2.jpg","orientation":"Paysage"}},			 
               {"item":{"nom_fichier":"g3.jpg","orientation":"Paysage"}}			 
			 ]
         }

//alert(json.diapositives[0].item.orientation)		 
var faille={"propriete":alert("coucou")}
}



window.onload = explore_json