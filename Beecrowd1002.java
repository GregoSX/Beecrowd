import java.io.IOException;
import java.util.*;
 
public class Beecrowd1002 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double raio = Double.parseDouble(entrada.nextLine());
        double areaCirculo = Math.pow(raio, 2) * 3.14159;
        System.out.println(String.format("A=%.4f", areaCirculo)); 
        entrada.close();
    }
 
}