package Interfeys;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * r * r;
    }

}
