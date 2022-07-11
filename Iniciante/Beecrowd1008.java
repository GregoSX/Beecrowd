import java.io.IOException;
import java.util.*;

public class Beecrowd1008 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        double c = Double.parseDouble(entrada.nextLine());

        double salario = b * c;
        
        System.out.println("NUMBER = " + a);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
        entrada.close();
    }
}
