package graphics;



public class Rectangle extends Shape{
    private double altura;
    private double base;

    public Rectangle(double altura, double base) {
        altura = altura;
        base = base;
    }

    @Override
    public double getArea() {
        return altura * base;
    }


}
