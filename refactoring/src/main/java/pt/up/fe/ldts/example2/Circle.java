package pt.up.fe.ldts.example2;

public class Circle extends Shape {

    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() throws Exception {
        return this.radius * this.radius * 3.1416;
    }

    @Override
    public double getPerimeter() throws Exception {
        return 2 * this.radius * 3.1416;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, radius);
    }
}
