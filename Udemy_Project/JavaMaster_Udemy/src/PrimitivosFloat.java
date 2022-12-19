import java.util.concurrent.ForkJoinPool;

public class PrimitivosFloat {

    public static void main(String[] args) {
        
        float realFloat = 0.00000000015f; //1.5e-10f;

        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;

        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;

        System.out.println("varFlotante = " + varFlotante);

    }

}
