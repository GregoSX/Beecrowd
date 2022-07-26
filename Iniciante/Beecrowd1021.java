import java.io.IOException;
import java.util.*;

public class Beecrowd1021 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();
        int dinheiroNotas = (int) valor;
        int dinheiroMoedas = (int) ((valor - dinheiroNotas) * 100);


        int notas100 = dinheiroNotas / 100;
        dinheiroNotas -= notas100 * 100;
        int notas50 = dinheiroNotas / 50;
        dinheiroNotas -= notas50 * 50;
        int notas20 = dinheiroNotas / 20;
        dinheiroNotas -= notas20 * 20;
        int notas10 = dinheiroNotas / 10;
        dinheiroNotas -= notas10 * 10;
        int notas5 = dinheiroNotas / 5;
        dinheiroNotas -= notas5 * 5;
        int notas2 = dinheiroNotas / 2;
        dinheiroNotas -= notas2 * 2;

        int moeda1 = dinheiroNotas;
        dinheiroNotas -= moeda1;
        int moeda05 = dinheiroMoedas / 50;
        dinheiroMoedas -= moeda05 * 50;
        int moeda025 = dinheiroMoedas / 25;
        dinheiroMoedas -= moeda025 * 25;
        int moeda010 = dinheiroMoedas / 10;
        dinheiroMoedas -= moeda010 * 10;
        int moeda005 = dinheiroMoedas / 5;
        dinheiroMoedas -= moeda005 * 5;
        int moeda001 = dinheiroMoedas;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda05 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");

        entrada.close();
    }
}
