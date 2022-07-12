import java.io.IOException;
import java.util.*;

public class Beecrowd1012 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double a = Double.parseDouble(entrada.next());
        double b = Double.parseDouble(entrada.next());
        double c = Double.parseDouble(entrada.next());
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo)); 
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo)); 
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio)); 
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado)); 
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo)); 
        entrada.close();
    }
}
