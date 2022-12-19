import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        System.out.println("Bienvenido al detalle de factura");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Factura");


        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese Valor Producto 1");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese Valor Producto 2");
        double valor2 = scanner.nextDouble();

        double total1 = valor1 + valor2;
        double totalIva = total1 * 0.19 ;
        double totalFinal = total1 + totalIva;

        System.out.println("Valor total sin IVA = " + total1);
        System.out.println("Valor IVA de sus productos = " + totalIva);

        String mensaje = "La Factura " + nombreFactura + " Tiene un total bruto de: " +  total1
                + "\n" + "Con un impuesto de: " + totalIva
                + "\n" + "y el monto con impuesto es de " + totalFinal ;

        System.out.println(mensaje);


    }
}
