package pt.up.fe.ldts.example2;

public class Rectangle extends Shape {

    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() throws Exception {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() throws Exception {
        return (this.width+this.height)*2;
    }

    @Override
    public void draw(GraphicFramework graphics) {

        graphics.drawLine(x, y, x + width, y);
        graphics.drawLine(x + width, y, x + width, y + height);
        graphics.drawLine(x + width, y + height, x, y + height);
        graphics.drawLine(x, y + height, x, y);

    }
}
