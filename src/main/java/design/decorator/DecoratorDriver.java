package design.decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        //decorating circle with red color
        Shape s =  new RedShapeDecorator(c);
        s.draw();

    }
}
