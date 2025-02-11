package lv.rvt;

public class Triangle extends GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void displayInfo() {
        System.out.println("Triangle with sides " + sideA + ", " + sideB + ", " + sideC);
        System.out.println("Triangle area: " + getArea());
        System.out.println("Triangle perimeter: " + getPerimeter());
    }
}
