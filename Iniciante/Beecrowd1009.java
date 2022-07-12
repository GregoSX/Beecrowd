import java.io.IOException;
import java.util.*;

public class Beecrowd1009 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        Double salario = Double.parseDouble(entrada.nextLine());
        Double totalVendas = Double.parseDouble(entrada.nextLine());
        Double total = salario + totalVendas * 0.15;
        System.out.println(String.format("TOTAL = R$ %.2f", total));
        entrada.close();
    }
}
