package Decorator;

public class ChocolateFlavour extends Flavour {
    @Override
    String getDescription() {
        return "It is Chocolate flavour";
    }

    @Override
    float getCost() {
        return 50;
    }
}
