import java.io.IOException;
import java.util.*;

public class Beecrowd1004 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        int prod = a * b;
        System.out.println("PROD = " + prod);
        entrada.close();
    }
}
