import java.io.IOException;
import java.util.*;

public class Beecrowd1014 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int x = Integer.parseInt(entrada.nextLine());
        double y = Double.parseDouble(entrada.nextLine());
        double consumo = x / y;
        System.out.println(String.format("%.3f km/l", consumo));
        entrada.close();
    }
}
