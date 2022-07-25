import java.io.IOException;
import java.util.*;

public class Beecrowd1015 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double soma = Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0);

        double distancia = Math.sqrt(soma);

        System.out.println(String.format("%.4f", distancia));
        
        entrada.close();
    }
}
