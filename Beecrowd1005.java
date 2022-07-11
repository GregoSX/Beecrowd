import java.io.IOException;
import java.util.*;

public class Beecrowd1005 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double a = Double.parseDouble(entrada.nextLine());
        double b = Double.parseDouble(entrada.nextLine());
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.println(String.format("MEDIA = %.5f",media));
        entrada.close();
    }
}
