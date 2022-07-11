import java.io.IOException;
import java.util.*;
public class Beecrowd1006 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double a = Double.parseDouble(entrada.nextLine());
        double b = Double.parseDouble(entrada.nextLine());
        double c = Double.parseDouble(entrada.nextLine());
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.println(String.format("MEDIA = %.1f",media));
        entrada.close();
    }
}
