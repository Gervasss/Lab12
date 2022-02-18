package graphics;



public class Circle extends Shape{
    private double _raio;

    public Circle (double raio) {
        _raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * _raio * _raio;
    }
    
}
