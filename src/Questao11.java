import java.util.Scanner;
import java.util.Random;


public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int numeroSecreto = gerador.nextInt(1, 101);
        int palpite = 0;
        int tentativas = 0;

        System.out.print("\nJOGO DA ADVINHAÇÃO!\n");

        System.out.println("\nEstou pensando em um número entre 1 e 100...");

        while (true) {
            System.out.print("\nDê o seu palpite: ");
            palpite = leitor.nextInt();
            tentativas += 1;

            if (palpite > numeroSecreto)
                System.out.print("\nMuito alto. Tente novamente.");

            else if (palpite < numeroSecreto)
                System.out.print("\nMuito baixo. Tente novamente.");
            else if (palpite == numeroSecreto) {
                System.out.println("\nParabéns! O número secreto era " + numeroSecreto + "\nVocê acertou em " + tentativas + " tentativas.");
                System.out.println("\nDeseja jogar novamente? (s para Sim e n para Não)");
                char repetir = leitor.next().charAt(0);

                if (repetir != 's') {
                    System.out.print("\nFim de Jogo!");
                    break;
                }
            }
        }


        leitor.close();
    }
}