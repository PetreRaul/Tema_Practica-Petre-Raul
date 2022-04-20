public class Main {
    public static void main(String[] args) {
        Factory f1 = new Factory("Germany", "Munchen");
    Vehicle v = new Vehicle("BMV","Blue",1.4f,2014,true,f1);
    Vehicle v1 = new Vehicle();
    Motorcycle v2 = new Motorcycle();


        System.out.println(v.getModel());
        System.out.println(v.getColor());
        System.out.println(v.getHeight());
        System.out.println(v.getYear());
        System.out.println(v.isElectrical());

        System.out.println("\n" + v);
        System.out.println(v1);
        System.out.println(v2);





    }

}
