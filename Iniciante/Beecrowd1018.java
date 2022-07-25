import java.io.IOException;
import java.util.*;

public class Beecrowd1018 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();
        int qtde100 = 0, qtde50 = 0, qtde20 = 0, qtde10 = 0, qtde5 = 0, qtde2 = 0, qtde1 = 0;

        System.out.println(valor);

        while (valor  > 0) {
            if(valor >= 100) {
                valor -= 100;
                qtde100++;
            }
            else if(valor >= 50) {
                valor -= 50;
                qtde50++;
            }
            else if(valor >= 20) {
                valor -= 20;
                qtde20++;
            }
            else if(valor >= 10) {
                valor -= 10;
                qtde10++;
            }
            else if(valor >= 5) {
                valor -= 5;
                qtde5++;
            }
            else if(valor >= 2) {
                valor -= 2;
                qtde2++;
            }
            else {
                valor -= 1;
                qtde1++;
            }
        }

        System.out.println(qtde100 + " nota (s) de R$ 100,00");
        System.out.println(qtde50 + " nota (s) de R$ 50,00");
        System.out.println(qtde20 + " nota (s) de R$ 20,00");
        System.out.println(qtde10 + " nota (s) de R$ 10,00");
        System.out.println(qtde5 + " nota (s) de R$ 5,00");
        System.out.println(qtde2 + " nota (s) de R$ 2,00");
        System.out.println(qtde1 + " nota (s) de R$ 1,00");

        entrada.close();
    }
}
