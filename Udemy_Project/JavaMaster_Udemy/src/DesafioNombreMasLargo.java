import javax.swing.JOptionPane;

public class DesafioNombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese Primer nombre y apellido");
        String nombre2 = JOptionPane.showInputDialog("Ingrese Segundo nombre y apellido");
        String nombre3 = JOptionPane.showInputDialog("Ingrese Tercer nombre y apellido");

        String nombreLargo = " ";
        if (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length()
                && nombre1.split("0")[0].length() > nombre3.split(" ")[0].length()){
            nombreLargo = nombre1.split(" ")[0];
        }if (nombre2.split(" ")[0].length() > nombre3.split(" ")[0].length()
                && nombre2.split(" ")[0].length() > nombre1.split(" ")[0].length()){
            nombreLargo = nombre2.split(" ")[0];
        }if (nombre3.split(" ")[0].length() > nombre1.split(" ")[0].length()
                && nombre3.split(" ")[0].length() > nombre2.split(" ")[0].length()){
            nombreLargo = nombre3.split(" ")[0];
        }


        System.out.println(" Nombre 1 = " + nombre1.length());
        System.out.println(" Nombre 2 = " + nombre2.length());
        System.out.println(" Nombre 3 = " + nombre3.length());
        System.out.println(" El nombre más largo es el de = " + nombreLargo);
    }
}
