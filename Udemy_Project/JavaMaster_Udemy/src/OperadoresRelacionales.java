public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        // "k" = 0.0000000,127    ___e-7 me indica exponente negativo de 7 '-7' y f/ del tipo Float
        float k = 127e-7f;
        // "l" = 2.141,3    ___e3 me indica exponente de 3, desde el punto 3 digitos positivos va la coma" , "
        double l = 2.1413e3;
        boolean m = false;

        //\__operador de asignación__/\__(operadores relacionales)__/
        //Por precedencia siempre se evaluará primero los operadores relacionales, tengan o no () para brindar prioridad
        boolean b1 = (i == j);
        System.out.println("b1 = " + b1);

        boolean b2 = (!b1);
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; // en otros lenguajes se utiliza " <> " para la negation
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

        boolean b6 = i > j;
        System.out.println("b6 = " + b6);

        boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);

        boolean b9 = l <= k;
        System.out.println("b9 = " + b9);

    }

}
