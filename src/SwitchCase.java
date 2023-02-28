public class SwitchCase {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        String operador = "*";

        switch (operador) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operador no válido");
        }
    }
}
