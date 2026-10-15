package Aula;
import java.util.*;

public class Main1 {

    public static void main(String[] args) {
      String[] nome = new String[5];
      Scanner scanner = new Scanner(System.in);
      for (int i = 0; i < nome.length; i++) {
         System.out.print("Nome " + (i + 1) + ": ");
         nome[i] = scanner.nextLine();
      }
      System.out.println("\nNomes leídos:");
      System.out.println(String.join(", ", nome));
      scanner.close();
    }
}
///A ideia era escrever uma sequencia de nomes separados por uma virgula///