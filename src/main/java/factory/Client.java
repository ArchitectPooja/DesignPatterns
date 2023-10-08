package factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.DrawShape(ShapeList.SQUARE.name());
    }
}
