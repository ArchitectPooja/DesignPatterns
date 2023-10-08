package Decorator;

public class ChocoSyrupDecorator extends  DecoratorOnFlavour {

    Flavour iceCream;

    ChocoSyrupDecorator(Flavour iceCream){
        this.iceCream = iceCream;
    }
    @Override
    String getDescription(){
        return iceCream.getDescription() + " with Choco Syrup";
    }
    @Override
    float getCost() {
        return iceCream.getCost() + 25;
    }
}
