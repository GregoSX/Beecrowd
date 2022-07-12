import java.io.IOException;
import java.util.*;

public class Beecrowd1010 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int codigo1 = Integer.parseInt(entrada.next());
        int qtd1 = Integer.parseInt(entrada.next());
        double valor1 = Double.parseDouble(entrada.nextLine());
        int codigo2 = Integer.parseInt(entrada.next());
        int qtd2 = Integer.parseInt(entrada.next());
        double valor2 = Double.parseDouble(entrada.nextLine());
        double valorTotal = (valor1 * qtd1) + (valor2 * qtd2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTotal));
        entrada.close();
    }
}
