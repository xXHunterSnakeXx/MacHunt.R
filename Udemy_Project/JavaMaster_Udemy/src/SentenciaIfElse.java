public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;
        if(promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!");
        }else if(promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        }else if(promedio >= 5.5){
            System.out.println("Buen Promedio!");
        }else if(promedio >= 5.0){
            System.out.println("regular, necesitas esforzarte un poco mas!");
        }else if(promedio >= 4.0){
            System.out.println("Insuficiente, necesitas esforzarte un poco mas!");
        }else{
            System.out.println("Reprobado!");
        }
        System.out.println("tu promedio es " + promedio);
    }
}
