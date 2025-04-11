package geometria;

/**
 * Classe demonstrativa do uso das formas geométricas
 */
public class DemoGeometria {
    public static void main(String[] args) {
        // Demonstração do Triângulo
        Triangulo triangulo = new Triangulo(5, 10);  // Added comma between parameters
        triangulo.setCor("Azul");
        
        System.out.println("=== Demonstração do Triângulo ===");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimetro());
        System.out.println("Cor: " + triangulo.getCor());
    }
}
