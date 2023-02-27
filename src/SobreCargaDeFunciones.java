public class SobreCargaDeFunciones {

    public static void main(String[] args) {

        identificador(10);
        identificador("palabra");
        identificador("Juan", "Perez");

    }
    public static void identificador(int input) {
        System.out.println("Yo soy un input de tipo entero y mi valor es " + input);
    };
    public static void identificador(String input) {
        System.out.println("Yo soy un input de tipo string y mi valor es " + input);
    }

    public static void identificador(String name, String lastName) {
        System.out.println("Yo recibí dos inputs de tipo string y por lo tanto me llamo " + name + " " + lastName + ".");
    }
}
