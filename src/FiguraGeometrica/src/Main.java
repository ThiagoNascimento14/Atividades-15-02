import java.util.List;
import java.util.ArrayList;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando uma lista de figuras geométricas variadas
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(9));
        figuras.add(new Retangulo(7, 2));
        figuras.add(new Triangulo(5, 2, 9));

        // Imprimindo áreas e perímetros utilizando polimorfismo
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
