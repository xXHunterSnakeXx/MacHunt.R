let menuVisible =false;
//funcion que muestra u oculta el menu
function mostrarOcultarMenu(){
    if(menuVisible){
        document.getElementById("nav").classList="";
        menuVisible = false;
    }else{
        document.getElementById("nav").classList="responsive";
        menuVisible = true;
    }
}

//Se ocultara el menu una vez seleccionada una opcion
function seleccionar(){
    document.getElementById("nav").classList="";
    menuVisible = false;
}

//Funcion para aplicar las animaciones de las Skills
function efectoHabilidades(){
    var skills = document.getElementById("skills");
    var distancia_skills = window.innerHeight - skills.getClientRects().top;
    if (distancia_skills >=300){
        let habilidades = document.getElementsByClassName("progreso");
        habilidades[0].classList.add("java");
    /*  habilidades[1].classList.add("python");
        habilidades[2].classList.add("html-css");
        habilidades[3].classList.add("javascript");
        habilidades[4].classList.add("mySql");
        habilidades[5].classList.add("github");
        habilidades[6].classList.add("design-skills");
        habilidades[7].classList.add("ingles");
        habilidades[8].classList.add("comunicacion");
        habilidades[9].classList.add("team-work");
        habilidades[10].classList.add("creatividad");
        habilidades[11].classList.add("dedicacion");
        habilidades[12].classList.add("compromiso");
    */
    }
}
//scrolling para aplicar animacion en barra de habilidades
window.onscroll = function(){
    efectoHabilidades();
}