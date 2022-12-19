import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condition ? si es verdadero : si es falso
        String variable = 7==7 ? "si, es verdadero" : "si, es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de Matematicas entre 2.0 - 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de Ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de Historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);


        //esta sintaxis con "Operador Ternario" vendría siendo una version Abreviada o resumida del "if"
        estado = promedio >= 4.2 ? "Aprobado!":"Rechazado!";
        System.out.println("estado = " + estado);
        //el if y else a continuacion, se presenta en solo una linea de codigo .
        if(promedio >= 4.2) {
            estado = "aprobado";
        }else{
            estado = "rechazado";
        }
        System.out.println("estado = " + estado);



    }
}
