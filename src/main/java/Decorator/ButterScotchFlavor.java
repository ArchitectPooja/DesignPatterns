package Decorator;

public class ButterScotchFlavor extends Flavour{
    @Override
    String getDescription() {
        return "It is Butter Scotch flavour ";
    }

    @Override
    float getCost() {
        return 70;
    }
}
