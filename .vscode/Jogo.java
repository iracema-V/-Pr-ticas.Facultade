import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palavra secreta definida em um array de letras
        char[] palavraSecreta = {'J', 'A', 'V', 'A'};
        
        // Array para armazenar o progresso do jogador (inicializado com '_')
        char[] palavraDescoberta = new char[palavraSecreta.length];
        for (int i = 0; i < palavraDescoberta.length; i++) {
            palavraDescoberta[i] = '_';
        }

        int tentativasRestantes = 6;
        boolean venceu = false;

        System.out.println("=== JOGO DA FORCA ===");

        while (tentativasRestantes > 0 && !venceu) {
            System.out.println("\nPalavra: " + String.valueOf(palavraDescoberta));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            
            char chute = scanner.next().toUpperCase().charAt(0);
            boolean acertou = false;

            // Verifica se a letra digitada existe na palavra secreta
            for (int i = 0; i < palavraSecreta.length; i++) {
                if (palavraSecreta[i] == chute) {
                    palavraDescoberta[i] = chute;
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Boa! A letra '" + chute + "' está na palavra.");
            } else {
                tentativasRestantes--;
                System.out.println("Ops! A letra '" + chute + "' não está na palavra.");
            }

            // Verifica se o jogador completou a palavra
            venceu = true;
            for (int i = 0; i < palavraDescoberta.length; i++) {
                if (palavraDescoberta[i] == '_') {
                    venceu = false;
                    break;
                }
            }
        }

        // Mensagem final
        System.out.println("\n====================");
        if (venceu) {
            System.out.println("Parabéns! Você venceu. A palavra era: " + String.valueOf(palavraSecreta));
        } else {
            System.out.println("Fim de jogo! Você perdeu. A palavra era: " + String.valueOf(palavraSecreta));
        }

        scanner.close();
    }
}