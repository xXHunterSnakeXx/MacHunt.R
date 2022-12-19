import java.util.Scanner;

public class FlujosDeControl {
    public static void main(String[] args) {

        // while{ }

        Scanner sn = new Scanner(System.in);
        double combustible;
        int continuar = 1;

        while (continuar == 1 ){

            System.out.println("Ingrese cantidad de combustible");
            combustible = sn.nextDouble();


            if (combustible == 70 ){
                System.out.println("Estanque Lleno!!!");
            }if(combustible < 70 && combustible > 60){
                System.out.println("Estanque CasiLleno");
            }if(combustible <= 60 && combustible > 40){
                System.out.println("Estanque al 3/4");
            }if(combustible <= 40 && combustible > 35){
                System.out.println("Medio Estanque");
            }if(combustible <= 35 && combustible > 20){
                System.out.println("Suficiente");
            }if(combustible <= 20 && combustible >= 0){
                System.out.println("Insuficiente");
            }
            System.out.println("combustible = " + combustible + " Lts");

            System.out.println("Reingresar marque) 1 ");
            System.out.println("Salir Marque) 2 ");

            continuar = sn.nextInt();
            if (continuar >= 2 ) {
                System.out.println("Saliendo!!!");
            }

        }



        //do{ } while { }
        int continuarDo = 0;
        float promedio = 0f;

        //float promedio = 5.8f;
        do{
            System.out.println("Ingrese promedio");
            promedio = sn.nextFloat();
            if(promedio >= 6.5){
                System.out.println("Felicitaciones, excelente promedio!");
            }else if(promedio >= 6.0){
                System.out.println("Muy buen promedio!");
            }else if(promedio >= 5.5){
                System.out.println("Buen Promedio!");
            }else if(promedio >= 5.0){
                System.out.println("regular, necesitas esforzarte un poco mas!");
            }else if(promedio >= 4.0){
                System.out.println("Insuficiente, necesitas esforzarte un poco mas!");
            }else{
                System.out.println("Reprobado!");
            }
            System.out.println("tu promedio es " + promedio);

            System.out.println("Presiona nº1  para reintentar");
            continuarDo = sn.nextInt();
        }while(continuarDo == 1 );


        //for(Inicializacion ;Condicion ; Incremento){ }

        System.out.println("##__Fujo de control For__##");

        //System.out.println("Presione 1 para continuar");
        int continuarFor = 1;


        for ( int i = 0;continuarFor == 1; i++){
            //String variable = 7==7 ? "si, es verdadero" : "si, es falso";
            //System.out.println("variable = " + variable);

            String estado = "";
            double promedioFor = 0.0;

            double matematicas = 0.0;
            double ciencias = 0.0;
            double historia = 0.0;

            Scanner s = new Scanner(System.in);

            System.out.println("Ingrese la nota de Matematicas entre 2.0 - 7.0");
            matematicas = s.nextDouble();
            System.out.println("Ingrese la nota de Ciencias entre 2.0 - 7.0");
            ciencias = s.nextDouble();
            System.out.println("Ingrese la nota de Historia entre 2.0 - 7.0");
            historia = s.nextDouble();

            promedioFor = (matematicas + ciencias + historia) / 3;
            System.out.println("promedio = " + promedioFor);


            //esta sintaxis con "Operador Ternario" vendría siendo una version Abreviada o resumida del "if"
            estado = promedioFor >= 4.2 ? "Aprobado!":"Rechazado!";
            System.out.println("estado = " + estado);
            //el if y else a continuacion, se presenta en solo una linea de codigo .
            if(promedioFor >= 4.2) {
                estado = "aprobado";
            }else{
                estado = "rechazado";
            }
            System.out.println("estado = " + estado);

            System.out.println("Presione 1 para reintentar");

            continuarFor = s.nextInt();


            if (continuarFor != 1){
                System.out.println("SALIENDO!!!");
            }
        }




    }
}
