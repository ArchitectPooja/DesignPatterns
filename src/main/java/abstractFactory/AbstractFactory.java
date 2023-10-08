package abstractFactory;

public class AbstractFactory {
    public void GetCar(String carType){
        if(carType.equals(CarType.ORDINARY.name())){
            OrdinaryFactory of = new OrdinaryFactory();
            of.OrdinaryCar(CarList.MARUTI.name());
            of.OrdinaryCar(CarList.SWIFT.name());
        }
        else if(carType.equals(CarType.LUXURY.name())){
            LuxuryFactory lf = new LuxuryFactory();
            lf.LuxuryCar(CarList.BMW.name());
            lf.LuxuryCar(CarList.ROLLRORCE.name());
        }
    }
}
