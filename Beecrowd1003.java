import java.io.IOException;
import java.util.*;
 
public class Beecrowd1003 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        entrada.close();
    }
}