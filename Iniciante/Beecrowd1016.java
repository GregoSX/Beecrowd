import java.io.IOException;
import java.util.*;

public class Beecrowd1016 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int distancia = entrada.nextInt();
        int tempoNecessario = distancia * 2;

        System.out.println(tempoNecessario + " minutos");

        entrada.close();
    }
}
