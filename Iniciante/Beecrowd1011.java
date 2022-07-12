import java.io.IOException;
import java.util.*;

public class Beecrowd1011 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double raio = Double.parseDouble(entrada.nextLine());
        double volume = (4 / 3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.println(String.format("VOLUME = %.3f", volume));
        entrada.close();
    }
}
