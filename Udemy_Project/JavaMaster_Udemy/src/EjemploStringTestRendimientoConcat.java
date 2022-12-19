public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0 ; i < 10000; i = i+1){
            //c = c.concat(a).concat(b).concat("\n"); //500 iteraciones en 5 ms, 1000 iteraciones en 20 ms, 10.000 => 308ms
            //c += a + b + "\n"; // 500 iteraciones en 54 ms, 1000 iteraciones en 46 ms, 10.000 => 200ms
            sb.append(a).append(b).append("\n"); //500 iteraciones en 0 ms, 1000 iteraciones en 1 ms, 10.000 => 10ms
        }

        long fin = System.currentTimeMillis();
        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb );


    }
}
