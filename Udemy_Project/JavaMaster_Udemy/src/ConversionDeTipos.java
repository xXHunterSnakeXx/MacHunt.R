public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        System.out.println(numeroStr);


        // Aunque las variables String Double boolean, ETC  las declare como "var"
        //el valor final sera la conversion de dato solicitada
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroStr = " + numeroStr);
        
        String realStr = "98765.43"; 
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TRUE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroStr = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        System.out.println("otroNumeroStr + String = " + otroNumeroStr+10);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealDouble = " + otroRealDouble);

        otroRealStr = String.valueOf(1.23456e3f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b =(char) i ;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);




    }
}
