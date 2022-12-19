import java.util.Scanner;

public class DesafioNumMayorMenor {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int num1 , num2 = 0;



        System.out.println("Ingrese un numero");
        num1 = sn.nextInt();

        System.out.println("Ingrese un segundo numero");
        num2 = sn.nextInt();

        Object ordenNumerico = num1 > num2 ? num1 + " y " + num2 : num2 + " y " + num1 ;
        System.out.println("Orden Numero mayor y menor = " + ordenNumerico);

        if (num1 > num2 ){
            System.out.println("Numero mayor = " + num1);
            System.out.println("Numero menor = " + num2);
        }else{
            System.out.println("Numero Mayor = " + num2);
            System.out.println("Numero Menor = " + num1);
        }

    }
}
