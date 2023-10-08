package abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory af =new AbstractFactory();
        af.GetCar(CarType.LUXURY.name());
    }
}
