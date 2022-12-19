public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre Incremento
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post Incremento
        i = 2;
        System.out.println("Valor inicial de i = " + i);
        j = i++; //

        System.out.println("Valor PostIncremento de i = " + i);
        System.out.println("j = " + j);


        //Pre Decremento
        System.out.println("Pre Decremento");
        i = 3;
        j = --i; // i = i - 1 => 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        System.out.println("Post Decremento");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
        System.out.println("(++j) = " + (++j));
        System.out.println("j = " + j);


    }
}
