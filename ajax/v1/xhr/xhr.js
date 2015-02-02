function explore(arg){
var diapo = arg.getElementsByTagName('item')
var nb_diapo=diapo.length
for (var i=0;i<nb_diapo;i++){
//alert(diapo[i].firstChild.nodeValue)
alert(diapo[i].getAttribute('orientation'))

}

}


function xhr_recuperation(){

var objxhr =xhr_connect()

    if(objxhr){
    
	objxhr.onreadystatechange= function() {
      if(objxhr.readyState==4){
	   if(objxhr.status==200){
		   //alert(objxhr.responseText)
		   //alert(objxhr.responseXML)
		    explore(objxhr.responseXML)
	   }//fin if 200
	  }//fin if 4
     }
	
	//objxhr.open("GET","donnees.txt",true)
	objxhr.open("GET","donnees.xml",true)
	objxhr.send(null)
    
	
	}else{

alert("souci d'xmlhttpRequest")
    }//fin else
	



}//fin function




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
	
window.onload=xhr_recuperation