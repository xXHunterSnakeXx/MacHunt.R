public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        // "k" = 0.0000000,127    ___e-7 me indica exponente negativo de 7 '-7' y f/ del tipo Float
        float k = 127e-7f;
        // "l" = 2.141,3    ___e3 me indica exponente de 3, desde el punto 3 digitos positivos va la coma" , "
        double l = 2.1413e3;
        boolean m = false;

        // Para operador logico de condicion && todas las condiciones deben cumplirse para ser verdadero
        //en este caso evalua que i == j es false, por lo tanto, no evalua si es que k > l
        boolean b1 = i == j && k > l;
        System.out.println("b1 = " + b1);

        boolean b0 = i != j && k < l && m == false;
        System.out.println("b0 = " + b0);

        //con operador logico or " || " una de las condiciones debe cumplirse para resultado TRUE
        boolean b2 = i == j || k < l ;
        System.out.println("b2 = " + b2);

        //en este ejemplo en el operaddor logico && ambas condiciones son false,
        // pero el or "||" cumple con ser verdadero, or lo tanto me dara como valor TRUE
        //puedo dar prioridad a una condicion agregando () a esta
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false ; // "TRUE" //yes_
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false)&& false)||false;
        System.out.println("b7 = " + b7);

        // los parectesis son fundamentales, el uso de () para llevar un mejor control de las condiciones
        // regla1 de izquerda a derecha
        // regla2 && tiene mayor prioridad que el ||




    }

}
