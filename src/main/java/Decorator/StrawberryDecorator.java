package Decorator;

public class StrawberryDecorator extends DecoratorOnFlavour {

    Flavour iceCream;

    StrawberryDecorator(Flavour iceCream){
        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){
        return iceCream.getDescription() + " with Strawberry";
    }

    @Override
    float getCost() {
        return iceCream.getCost() + 35;
    }
}
