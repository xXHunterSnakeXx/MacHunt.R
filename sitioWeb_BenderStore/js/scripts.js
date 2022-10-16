// inicializamos librería AOS
AOS.init();

let menu = document.getElementById("menu");

let menu_bar= document.getElementById("menu-bar");
//Debo hacer que suba el menu

menu_bar.addEventListener("click", function() {
    //alert("aqui vamos!!!")

    menu.classList.toggle("menu-toggle")

})