import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        double combustible;
        int continuar;

        /*System.out.println("Ingrese cantidad de combustible");
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
        System.out.println("combustible = " + combustible + " Lts");*/



        for(int i = 0; i <= 2; i = i + 1 ){
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

            System.out.println("continuar? marque 1 salir 2");
            continuar = sn.nextInt();
            if (continuar > 2 ) {
                System.out.println("Opcion incorrecta marque 1 para continuar y salir 2!!!");
                continuar = sn.nextInt();
            }
            i = continuar;
        }


    }
}
