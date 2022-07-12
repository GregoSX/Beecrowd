import java.io.IOException;
import java.util.*;

public class Beecrowd1013 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.next());
        int b = Integer.parseInt(entrada.next());
        int c = Integer.parseInt(entrada.next());
        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB-c)) / 2;
        System.out.println(maiorABC + " eh o maior");
        entrada.close();
    }
}
