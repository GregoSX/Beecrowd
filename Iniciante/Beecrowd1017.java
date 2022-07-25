import java.io.IOException;
import java.util.*;

public class Beecrowd1017 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        final double gasto = 12.0;

        int tempoGasto = entrada.nextInt();
        int velocidadeMedia = entrada.nextInt();

        double qtdeLitros = (tempoGasto * velocidadeMedia) / gasto;

        System.out.println(String.format("%.3f", qtdeLitros));

        entrada.close();
    }
}
