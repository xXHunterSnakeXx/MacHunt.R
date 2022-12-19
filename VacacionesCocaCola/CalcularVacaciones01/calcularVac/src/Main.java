import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema vacacional");

        Scanner in = new Scanner(System.in);
        String nombre  = "";
        String nomDpto = "";
        int numDpto    = 0 , diasVac = 0 , antiguedad = 0 ;

        System.out.println("Ingrese nombre del Trabajador");
        nombre = in.nextLine();

        System.out.println("Ingrese sus años de antigüedad");
        antiguedad = Integer.parseInt(in.nextLine());

        System.out.println("Ingrese clave de departamento");
        System.out.println("1 - Atencion al cliente");
        System.out.println("2 - Logistica");
        System.out.println("3 - Gerencia");
        numDpto = Integer.parseInt(in.nextLine());


        while (numDpto <= 3) {
            if (numDpto == 1){
                nomDpto = "Atencion al cliente";
                if (antiguedad == 1){
                    diasVac = 6;
                } else if (antiguedad >= 2 && ( antiguedad <= 6)) {
                    diasVac = 14;
                } else if (antiguedad >= 7) {
                    diasVac = 20;
                }
            } else if (numDpto == 2) {
                nomDpto = "Logistica";
                if (antiguedad == 1){
                    diasVac = 7;
                } else if (antiguedad >=2 && (antiguedad <= 6)) {
                    diasVac = 15;
                } else if (antiguedad >=7) {
                    diasVac = 22;
                }
            } else if (numDpto == 3){
                nomDpto = "Gerencia";
                if (antiguedad == 1){
                    diasVac = 10;
                } else if (antiguedad >=2 && (antiguedad <=6)) {
                    diasVac = 20;

                } else if (antiguedad >=7) {
                    diasVac = 30;

                }
            }
            System.out.println("Departamento de: " + nomDpto + " // Hola : " + nombre +" Le corresponden " + diasVac +" Dias de vacaciones");
            break;
        }

        if (numDpto >=4){
            System.out.println("Clave de departamento no valida ");
        }
        if (antiguedad < 1){
            System.out.println("Aun no tiene derecho a vacaciones");
        }
    }


}
