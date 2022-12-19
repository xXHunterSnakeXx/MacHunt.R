import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Ingrese Nombre de un familiar");
        String nombreX = scanner.nextLine();
        String nombreX2 = nombreX.toUpperCase().charAt(1) + "." + nombreX.substring(nombreX.length()-2);

        System.out.println("nombreX2 = " + nombreX2);

        System.out.println("Ingrese otro Nombre");
        String nombreY = scanner.nextLine();
        String nombreY2 = nombreY.toUpperCase().charAt(1) + "." + nombreY.substring(nombreY.length()-2);

        System.out.println("nombreY2 = " + nombreY2);

        System.out.println("Ingrese otro nombre");
        String nombreZ = scanner.nextLine();
        String nombreZ2 = nombreZ.toUpperCase().charAt(1) + "." + nombreZ.substring(nombreZ.length()-2);

        System.out.println("nombreZ2 = " + nombreZ2);

        System.out.println("\nnombres : " + "\n" + nombreX2 + "\n" + nombreY2 + "\n" + nombreZ2 );

    }
}
