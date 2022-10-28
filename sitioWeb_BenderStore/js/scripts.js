// inicializamos librería AOS
AOS.init();

let menu = document.getElementById("menu");

let menu_bar= document.getElementById("menu-bar");


menu_bar.addEventListener("click", function() {
    //alert("aqui vamos!!!")

    menu.classList.toggle("menu-toggle")

})