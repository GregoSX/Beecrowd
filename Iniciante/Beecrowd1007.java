import java.io.IOException;
import java.util.*;

public class Beecrowd1007 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        int c = Integer.parseInt(entrada.nextLine());
        int d = Integer.parseInt(entrada.nextLine());
      
        int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);
        entrada.close();
    }
}
