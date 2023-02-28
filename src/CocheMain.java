public class CocheMain {

    public static void main(String[] args) {
        Coche cocheObj = new Coche("verde","Fiat","Random",1500.50,5.1);
        cocheObj.acelerar(50);
        System.out.println(cocheObj);
        cocheObj.peso= 1450;
        System.out.println(cocheObj);

        CocheElectrico cocheElectrico = new CocheElectrico("verde","Honda", "Civic", 1600d, 4.6,"sr Motor Eléctrico");
        System.out.println(cocheElectrico);
        cocheElectrico.acelerar(40);
        System.out.println(cocheElectrico);


    }
}
