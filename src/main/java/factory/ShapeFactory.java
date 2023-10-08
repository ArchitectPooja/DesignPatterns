package factory;

public class ShapeFactory {
    public void DrawShape(String shapeName){

        if(shapeName.equals(ShapeList.CIRCLE.name())){
            IShape shape = new Circle();
            shape.draw();
        } else if (shapeName.equals(ShapeList.RECTANGLE.name())){
            IShape shape = new Rectangle();
            shape.draw();
        } else if (shapeName.equals(ShapeList.SQUARE.name())) {
            IShape shape = new Square();
            shape.draw();
        }
    }
}
