public class CocheMain {

    public static void main(String[] args) {
        Coche cocheObj = new Coche("verde","Fiat","Random",1500.50,5.1);
        cocheObj.acelerar(50);
        System.out.println(cocheObj);
        cocheObj.peso= 1450;
        System.out.println(cocheObj);
    }
}
