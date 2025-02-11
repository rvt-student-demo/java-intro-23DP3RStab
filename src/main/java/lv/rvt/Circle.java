package lv.rvt;

public class Circle extends GeometricShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle radius: " + this.r);
        System.out.println("Circle area: " + getArea());
        System.out.println("Circle perimeter: " + getPerimeter());
    }
}
