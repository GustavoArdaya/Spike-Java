public class PolimorfismoMain {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();

        // Polimorfismo;

        Coche coche3 = new CocheElectrico();

        if (coche3 instanceof CocheElectrico){
            System.out.println("Coche Eléctrico");

        }
    }
}
