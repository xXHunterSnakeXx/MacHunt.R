public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.png";
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(13) = " + archivo.substring(13));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length() - 4));

        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        //(i + 1) Me indica que el indexOf partira desde el "." + 1 caracter mas mostrando la extension sin agregar el punto

    }
}
