import java.util.Scanner;

public class Contas{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite o primeiro número:");
        double num1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("\n--- RESULTADOS ---");
        // Operações Matemáticas
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num2 != 0 ? (num1 / num2) : "Erro: Divisão por zero"));
        System.out.println("Resto: " + (num2 != 0 ? (num1 % num2) : "Erro: Divisão por zero"));
        // Raiz Quadrada usando a biblioteca Math
        System.out.println("Raiz quadrada do 1º: " + Math.sqrt(num1));
        System.out.println("Raiz quadrada do 2º: " + Math.sqrt(num2));
        // Bônus: Potenciação (Primeiro número elevado ao segundo)
        System.out.println("1º número elevado ao 2º: " + Math.pow(num1, num2));
        teclado.close() ;
    }
}
