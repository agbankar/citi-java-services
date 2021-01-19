package design.decorator;

public class RedShapeDecorator  extends  ShapeDecorator{
    public RedShapeDecorator(Shape s) {
        super(s);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("filling circle with red color");
    }
}
