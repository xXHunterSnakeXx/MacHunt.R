public class HolaMundoUdemy {
    public static void main(String[] args) {

        String saludar = "Hola mundo desde java con udemy";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        int numero2= 5;
        boolean valor = true;
        //el valor por defecto de un boolean es "False", esto ocurre si no se declara su valor en una variable o condicion

        if (valor){
            System.out.println(" numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Andrés";

        if (numero >10){
            nombre = "Pedrito";
            System.out.println("nombre = " + nombre);
            numero = 20;
        }

        System.out.println("numero = " + numero);








    }
}
