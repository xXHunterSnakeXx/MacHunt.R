public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i = i + 1 ){
            System.out.println("i Incrementado = " + i);
        }
        System.out.println("----------------");
        for (int i = 10; i >= 0 ; i--){
            System.out.println("i Decrementado = " + i);
        }
        System.out.println("******************");
        for(int i = 1 , j = 10 ;i < j ; i ++ , j --){
            System.out.println( i + " # " + j );
        }
        System.out.println("..-...-..--.");
        for(int i = 0 ; i <= 10 ; i++ ){
            if ( !(i % 2 == 0) ){
                System.out.println("Entró aqui a quitarme los impares ");
                continue;
            }
            System.out.println("i = " + i);
        }

        for(int i = 0 ; i <= 10 ; i++ ) {
            if ( (i % 2 == 0) ) {
                System.out.println("ahora a quitarme los pares ");
                //se utiliza continue; para saltar la condicion aplicada en el if
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
