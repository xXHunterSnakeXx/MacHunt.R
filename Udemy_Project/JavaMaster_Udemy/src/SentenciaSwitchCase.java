import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese numero de prueba entre 0 - 3");
        int num = s.nextInt();

        switch (num){
            case 0 :
                System.out.println("el numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;

            default:
                System.out.println("Numero Fuera de secuencia");
        }

        System.out.println("Ingrese Nombre");
        String nombre = s.next();

        switch (nombre){
            case "admin":
                System.out.println("Hola ADMIN, Bienvenido!");
                break;
            case "claudio":
                System.out.println("Hola claudio!");
                break;
            case "pepe":
                System.out.println("Hola Pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }


        System.out.println("Ingrese Numero del mes entre 1 - 12");
        int numMes = s.nextInt();
        String nomMes = " ";


        switch (numMes){
            case 1 :
                nomMes = "Enero";
                break;
            case 2 :
                nomMes = "Febrero";
                break;
            case 3 :
                nomMes = "Marzo";
                break;
            case 4 :
                nomMes = "Abril";
                break;
            case 5 :
                nomMes = "Mayo";
                break;
            case 6 :
                nomMes = "Junio";
                break;
            case 7 :
                nomMes = "Julio";
                break;
            case 8 :
                nomMes = "Agosto";
                break;
            case 9 :
                nomMes = "Septiembre";
                break;
            case 10 :
                nomMes = "Octubre";
                break;
            case 11 :
                nomMes = "Noviembre";
                break;
            case 12 :
                nomMes = "Diciembre";
            default:
                System.out.println("Invalid Option!");

        }
        System.out.println("Mes Ingresado = " + nomMes);

    }
}
