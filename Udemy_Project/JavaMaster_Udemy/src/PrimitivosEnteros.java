public class PrimitivosEnteros {
    public static void main(String[] args) {

        //Es el entero más pequeño en java
        byte numeroByte = 127;
        System.out.println("numerobyte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte correspone en bites a " + Byte.SIZE);
        System.out.println("Valor Maximo de un byte : " + Byte.MAX_VALUE);
        System.out.println("Valor Minimo de un byte : " + Byte.MIN_VALUE);

        //
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short correspone en bites a " + Short.SIZE);
        System.out.println("Valor Maximo de un Short : " + Short.MAX_VALUE);
        System.out.println("Valor Minimo de un Short : " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor Maximo de un int : " + Integer.MAX_VALUE);
        System.out.println("Valor Minimo de un int : " + Integer.MIN_VALUE);

        long numeroLong = 2147483648999L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo int corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Long.SIZE);
        System.out.println("Valor Maximo de un int : " + Long.MAX_VALUE);
        System.out.println("Valor Minimo de un int : " + Long.MIN_VALUE);


        //Var para una variable numerica por defecto me asigna a un valor como int hasta que este valor sea Superior.
        var numeroVar = 127;




    }
}
