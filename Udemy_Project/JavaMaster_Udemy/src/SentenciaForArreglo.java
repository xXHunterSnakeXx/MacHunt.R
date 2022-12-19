import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //String[] nombres = new String[6];
        String [] nombres = {"Andres", "Pepe" , "Maria", "Paco", "Bea", "Pepa"};
        int count = nombres.length;
        for (int i = 0 ; i < count; i++){
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    (nombres[i].equalsIgnoreCase("paco"))){
                continue;

            }
            System.out.println(i + " " + nombres[i]);

        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre EJ: \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0 ; i < count ; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " Fue Encontrado! ");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No Fue Encontrado!");
        }

    }
}
