public class Arreglos {
    public static void main(String[] args) {

        String[] nombres = new String[5];
        int [] numeros = new int[3];

        numeros [0] = 10 ;
        numeros [1] = 33 ;
        numeros [2] = 34 ;

        nombres [0] = "Luna" ;
        nombres [1] = "Marco" ;
        nombres [2] = "Laslo" ;
        nombres [3] = "Maria" ;
        nombres [4] = "Melquiades" ;
        //nombres [5] = "Se Cae" ;

        //for (int i = 0 ; i > 10 ; i++){
        //}

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(nombres[i]);
        }

        //nombres.length para obtener la cantidad de ciclos que recorre el codigo
        // obteniendo la cantidad de datos y su position en el arreglo
        for (int i = 0; i < nombres.length; i++){
          System.out.println(i);
        }

    }
}
