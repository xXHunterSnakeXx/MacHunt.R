import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Docto de Practica");


        /*
        System.out.println("Operadores Aritmeticos #5");

        int num1 = 5;
        int num2 = 4;
        int resultado = 0;

        resultado = (num1 + num2) / 3;
        System.out.println("Su resultado es: " + resultado);


        System.out.println("Calcular Promedio #6");

        int prom1 = 5;
        int prom2 = 7;
        int prom3 = 7;
        int prom4 = 5;
        int promedio = 4;


        promedio = (prom1 + prom2 + prom3 + prom4) / promedio;

        if (promedio >= 6){
            System.out.println("El alumno aprobo con: " + promedio);
        }else{
            System.out.println("El alumno Reprobo con: " + promedio);
        }

        */

        System.out.println("#7 Estructuras condicionales anidadas + scanner");

        Scanner in = new Scanner(System.in);

        int operacion = 0;
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        System.out.println("Seleccionar operacion");
        System.out.println("Seleccionar 1 Suma");
        System.out.println("Seleccionar 2 Resta");
        System.out.println("Seleccionar 3 Multiplicacion");
        System.out.println("Seleccionar 4 Division");

        System.out.println("Opcion Nº: ");
        operacion = in.nextInt();

        System.out.println("Ingresa el primer valor: ");
        num1 = in.nextInt();

        System.out.println("Ingresa el segundo Valor: ");
        num2 = in.nextInt();



        if (operacion == 1){
            resultado = num1 + num2 ;

            System.out.println("Resultado de la SUMA es: " + resultado);
        }else if (operacion == 2){
            resultado = num1 - num2 ;

            System.out.println("Resultado de la RESTA es: " + resultado );
        }else if (operacion == 3) {
            resultado = num1 * num2 ;

            System.out.println("Resultado de la MULTIPLICACION es: " + resultado);
        }else if (operacion == 4){
            resultado = num1 / num2 ;

            System.out.println("Resultado de la DIVISION es: " + resultado);
        }else {
            System.out.println("La opcion seleccionada no existe");
        }


        /*


        System.out.println(" #8 Introducir datos con Scanner");

        //Debemos importar desde la api de java la libreria scanner en la cabeza del proyecto
        //"import java.util.Scanner"

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0 ;

        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Ingresa el primer valor");
        num1 = in.nextInt();

        System.out.println("Ingresa el segundo valor");
        num2 = in.nextInt();

        resultado = num1 + num2;

        System.out.println("Hola " + nombre + " El resulado de la suma es : " + resultado);



        //# Abreviatura IF ELSE... (Operador Ternario)
        //Ejemplo y abreviatura

        int time1 = 20;

        if (time1 < 18){
            System.out.println("Buenos dias!");
        }else {
            System.out.println("Buenas tardes!");
        }

        // OPERADOR TERNARIO
        // su Syntaxis es:  variable = (condition) ? expressionTrue :  expressionFalse;

        int tiempo2 = 17;
        String resultado2 = (tiempo2 < 18 ) ? "Buuenos dias" : "Buuenas tardes" ;
        System.out.println(resultado2);


         */

        /*
        //La instruccion continuar interrumpe la iteracion de la condicion especifica y salta a la siguente iteracion del bucle
        for (int i = 0; i < 10; i++) {
            if (i == 4 || (i == 6)) {
                continue;
            }
            System.out.println(i);
        }*/

          /*int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }*/
        /*int i = 0;
        while (i <= 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/

        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //System.out.println(cars.length);

        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //Imprime a cantidad de elementos alojados en el arreglo
        System.out.println(cars.length);

        //Case 1 para Imprimir los elementos dentro del arreglo
        for (int i = 0 ; i< cars.length;i++){
            System.out.println(cars[i]);

        //Case 2 para imprimir elementos dentro de arreglo
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //Matrices Multidimensionales
        //El sig code Imprime x para el 4to elemento dentro del 1er arreglo "9"
        public class Main {
        public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4, 9}, {5, 6, 7} };
        int x = myNumbers[0][4];
            System.out.println(x);
        }
}


        }*/



        //Condiciones compuestas con operadores relacionales y logicos

        System.out.println("Condiciones con operadores relacionales y logicos ");



    }
}