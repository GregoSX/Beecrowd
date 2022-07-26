import java.io.IOException;
import java.util.*;

public class Beecrowd1020 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        int ano = idade / 365;
        idade -= ano * 365;
        int mes = idade / 30;
        idade -= mes * 30;

        System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + idade + " dia(s)");

        entrada.close();
    }
}
