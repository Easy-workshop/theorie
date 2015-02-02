//----------------------------------
// dipositive
//----------------------------------
function charge_galerie(){
place_diapo()


}

//----------------------------------
// diapositive

//<div id="planche-contact">==>ok
//<div><img src="../images/Calenques/g1.jpg" width="259" height="194" alt="calenques"> </div>

//----------------------------------

function place_diapo(){
	var pc=document.getElementById("planche-contact")
	var div=document.createElement('div')
	var img=document.createElement('img')
	img.alt="Calenques"
	img.src="../images/Calenques/g1.jpg"
	div.appendChild(img)
	pc.appendChild(div)
}