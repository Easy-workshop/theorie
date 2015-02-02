function addLoadEvent(func) {
var oldonload = window.onload;
if (typeof window.onload != 'function') {
window.onload = func;
} else {
window.onload = function() {
oldonload();
func();
}
}
}


function set_up(){
/*
var child=document.getElementById("informations")
var p=child.getElementsByTagName('p')
var nb_p=p.length
for (var i=0;i<=nb_p;i++){
alert(p[i].firstChild.nodeValue)
}
*/
alert("glouglou1!")
}

function autre(){
alert("glouglou2!")
}

addLoadEvent(set_up)
addLoadEvent(autre)
