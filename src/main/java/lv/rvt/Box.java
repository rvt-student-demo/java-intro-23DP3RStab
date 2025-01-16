package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box(Box oldBox) {
        this(oldBox.width(), oldBox.height(), oldBox.length());
    }

    public double volume() {
        return this.width * this.height * this.length;
    }

    private double faceArea() {
        return this.width * this.height;
    }

    private double topArea() {
        return this.length * this.width;
    }

    private double sideArea() {
        return this.length * this.height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double length() {
        return this.length;
    }
    
    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width() && this.height < outsideBox.height() && this.length < outsideBox.length();
    }
}
