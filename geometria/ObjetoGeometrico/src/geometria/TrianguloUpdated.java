package geometria;

public class Triangulo extends ObjetoGeometrico {
    private double lado; // Attribute for equilateral triangle
    private double base;
    private double altura;

    Triangulo(double b, double a) {
        base = b;
        altura = a;
        lado = b; // Assuming equilateral triangle for perimeter calculation
    }

    public double getArea() {
        area = (base * altura) / 2;
        return area;
    }

    public double getPerimetro() {
        perimetro = 3 * lado; // Using lado for perimeter
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
