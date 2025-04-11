package geometria;

public class TrianguloTest {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 10);
        
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimetro());
    }
}
