import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {

        System.out.println("Ingresa un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // tomamos el numero que ingresa el usuario

        for (int i = 0; i <= n ;i++){
            for (int j = i; j < n ; j++){ //el loop j se encarga de imprimir los espacios en blanco
                System.out.println(" ");

            }
            //k loop
            for(int k = 1 ; k <= i; k++){
                System.out.println((k+i)+1);
            }
            //l
            for (int l=i; l > 1; l--){
                System.out.println((l+i)-2);
            }
            System.out.println("\n");
        }

    }
}
