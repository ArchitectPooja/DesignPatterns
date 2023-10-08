package abstractFactory;

public class LuxuryFactory {
    public void LuxuryCar(String carName){
        if(carName.equals(CarList.BMW.name())){
            IEngine engine = new BMW();
            engine.Engine();
        }
        else if(carName.equals(CarList.ROLLRORCE.name())){
            IEngine engine = new RollRorce();
            engine.Engine();
        }
    }
}
