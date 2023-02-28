public class While {
    public static void main(String[] args) {
        int nivelDeComida = 0;
        while (nivelDeComida < 5) {
            System.out.println("Que hambre, me como mi bocadillo " + (nivelDeComida + 1));
            nivelDeComida++;
        }
        System.out.println("Ahora si, a dormir la siesta");
    }


}
