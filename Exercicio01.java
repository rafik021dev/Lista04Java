import java.util.Scanner;
import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 numeros");

        int[] aNumeros = new int[5];
        for (int i = 0; i < 5; i++) {
            aNumeros[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(aNumeros));

        scanner.close();

    }    
}
