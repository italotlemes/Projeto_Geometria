package geometria;

public class Triangulo extends ObjetoGeometrico {
    private double lado; 
    private double base;
    private double altura;

    public Triangulo(double b, double a) {
        base = b;
        altura = a;
        lado = b; 
    }

    @Override
    public double getArea() {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = 3 * lado; 
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
