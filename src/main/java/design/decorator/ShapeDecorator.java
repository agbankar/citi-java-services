package design.decorator;

public abstract class ShapeDecorator implements Shape {
    private Shape s;

    public ShapeDecorator(Shape s) {
        this.s = s;
    }

    @Override
    public void draw() {
        s.draw();

    }
}
