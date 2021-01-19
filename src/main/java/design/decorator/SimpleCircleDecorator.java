package design.decorator;

public class SimpleCircleDecorator implements Shape {
   private Circle c;

    public SimpleCircleDecorator(Circle c) {
        this.c = c;
    }

    @Override
    public void draw() {
        c.draw();
        System.out.println("filling circle with blue color");

    }
}
