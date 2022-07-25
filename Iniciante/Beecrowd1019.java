import java.io.IOException;
import java.util.*;

public class Beecrowd1019 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int segundos = entrada.nextInt();
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        entrada.close();
    }
}
