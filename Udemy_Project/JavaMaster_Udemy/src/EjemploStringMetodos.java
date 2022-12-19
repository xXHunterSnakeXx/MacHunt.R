import javax.lang.model.SourceVersion;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Claudio";

        System.out.println("Nombre. length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Claudio\") = " + nombre.equals("Claudio"));
        System.out.println("nombre.equals(\"claudio\") = " + nombre.equals("claudio"));
        System.out.println("nombre.equalsIgnoreCase(\"claudio\") = " + nombre.equalsIgnoreCase("claudio"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Claudio\") = " + nombre.compareTo("Claudio"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-3));

        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(0,4));
        System.out.println("nombre.substring(4,7) = " + nombre.substring(4, 7));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-5));

        String trabalenguas = "trabalenguas" ;

        System.out.println("trabalenguas.replace(\"a\",\"u\") = " + trabalenguas.replace("a","u"));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("    TRABALENGUA S ");
        System.out.println("    TRABALENGUA S ".trim());

    }
}
