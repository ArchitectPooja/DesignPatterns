package abstractFactory;

public class OrdinaryFactory {
    public void OrdinaryCar(String carName){
        if(carName.equals(CarList.MARUTI.name())){
            IEngine engine = new Maruti();
            engine.Engine();
        }
        else if(carName.equals(CarList.SWIFT.name())){
            IEngine engine = new Swift();
            engine.Engine();
        }
    }
}
