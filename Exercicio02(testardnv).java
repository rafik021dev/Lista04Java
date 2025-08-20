import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 numeros reais");

        Double[] aNumeros = new Double[10];
        for (int i = 0; i < 10; i++) {
            aNumeros[i] = scanner.nextDouble();
        }
       
        Collections.reverse(Arrays.asList(aNumeros));
        System.out.println(Arrays.toString(aNumeros));

        scanner.close();
    }
}
