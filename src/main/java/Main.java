public class Main {

    public static void main(String[] args) {
        System.out.println("Version aus dem main-Branch");
        System.out.println("Version aus dem merge-conflict-Branch");

        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);

        factory.buildCar(car);
        factory.buildCar(car1);
    }
}
