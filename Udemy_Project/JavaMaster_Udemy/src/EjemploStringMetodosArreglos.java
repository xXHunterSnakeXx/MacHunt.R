public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

       String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        //FOR * (Inicializo i = 0 ; Mientras i sea < el arreglo "largo" Realizara el bucle dentro del for
        // ... ; i ++ para sumar la iteracion de i en el for)
        for (int i = 0; i < largo ; i ++ ){
            System.out.println(arreglo[i]);
        }
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j = 0 ; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jpg";
        String[] archivoArr = archivo.split("\\."); //[.]
        //Con Split indico en que caracter especifico quiero que me realice una separacion
        l= archivoArr.length;
        System.out.println("l = " + l);
        for(int j=0 ; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);



    }
}
