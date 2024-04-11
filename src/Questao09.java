import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = in.nextInt();
        System.out.println("\nTABUADA DO " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        in.close();
    }
}
