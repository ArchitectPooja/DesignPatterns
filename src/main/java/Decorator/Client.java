package Decorator;

public class Client {
    public static void main(String[] args) {
        Flavour fvButter = new ButterScotchFlavor();
        Flavour fvChoco = new ChocolateFlavour();

        Flavour dfStraw = new StrawberryDecorator(new ChocoSyrupDecorator(fvButter)) ;
        System.out.println(dfStraw.getDescription());
        System.out.println(dfStraw.getCost());

    }
}
