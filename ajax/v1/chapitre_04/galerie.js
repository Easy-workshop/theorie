//----------------------------------
// Gallerie charge_galerie()
//----------------------------------
function charge_galerie(){
var objxhr =xhr_connect()

    if(objxhr){
    
	objxhr.onreadystatechange= function() {
      if(objxhr.readyState==4){
	   if(objxhr.status==200){
		   
		    var retour=objxhr.responseXML
			place_galerie(retour)
	   }//fin if 200
	  }//fin if 4
     }
	//objxhr.open("GET","/Scripts/galerie_ref.xml",true)
	objxhr.open("GET","galerie_ref.xml",true)
	objxhr.send(null)
    
	
	}else{

alert("souci d'xmlhttpRequest")
    }//fin else
	


}
function place_galerie(arg){
var diapos=arg.getElementsByTagName('image')
var nb_diapo=diapos.length
for (i=0;i<nb_diapo;i++){
var  dia_temp = diapos[i]
var img = dia_temp.getElementsByTagName('ch_img_fichier')[0].innerHTML
var infos = dia_temp.getElementsByTagName('ch_img_sources')[0].innerHTML
var folder = dia_temp.getElementsByTagName('ch_img_folder')[0].innerHTML
var orientation = dia_temp.getAttribute('orientation')
place_diapo(img,infos,folder,orientation)

}



}
//-------------------------
//DIAPOSITIVE
//------------------------
function place_diapo(arg,src,folder,orientation){
	var pc=document.getElementById("planche-contact")
	var div=document.createElement('div')
	var img=document.createElement('img')
	img.alt=folder
	
	img.className=orientation
	img.src="../images/"+folder+"/"+arg
	div.appendChild(img)
	
	div.src=src
	div.onclick=function(){
	
	//alert(this.src)
	searchInfos(this.src)
	}
	
	pc.appendChild(div)
}
//-----------------------------------
//Gestion des informations
//-----------------------------------
function searchInfos(arg){
var objxhr =xhr_connect()

    if(objxhr){
    
	objxhr.onreadystatechange= function() {
      if(objxhr.readyState==4){
	   if(objxhr.status==200){
		   
		    var retour=objxhr.responseText
			details_JSON(retour)
	   }//fin if 200
	  }//fin if 4
     }
	//objxhr.open("GET","/Scripts/galerie_ref.xml",true)
	objxhr.open("GET","datas/"+arg,true)
	objxhr.send(null)
    
	
	}else{

alert("souci d'xmlhttpRequest")
    }//fin else
	


}
function details_JSON(arg){
//alert (arg)
var temp=null
var datas = eval('('+arg+')')
for (var i in datas.image){
 //alert(i+" = "+datas.image[i])
temp= document.getElementById(i)
switch (i){
case "ch_img_fichier" :
var infos_thumb	=document.getElementById('infos_thumb')
infos_thumb.src= "../images/"+datas.image.ch_img_rubId+"/"+datas.image.ch_img_fichier

default:
if (temp !=null){
temp.innerHTML=datas.image[i]
 }
}
 
 
 }

}




//-----------------------------------
//OBJET XML HTTP REQUEST
//-----------------------------------
function xhr_connect(){
	
    var xhr=false
	
	if(window.XMLHttpRequest){
	xhr= new XMLHttpRequest
	
	}else if(window.ActiveXObject){
	var iexhr =  new Array("Msxml2.XMLHTTP.8","Msxml2.XMLHTTP.7")

for(var i=0;i< iexhr.length && !reussi;i++){
     try{
	      xhr = new ActiveXObject(iexhr[i])
		  reussi=true
	    
		}//fin try
	   catch (e){
     

                }//fin catch
	
	}//fin else if	

	}//fin for

return xhr
	}//fin function
