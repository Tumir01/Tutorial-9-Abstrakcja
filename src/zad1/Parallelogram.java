package zad1;

public class Parallelogram implements Figure {
    private final double base;
    private final double side;
    private final double height;

    public Parallelogram(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + side);
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}
