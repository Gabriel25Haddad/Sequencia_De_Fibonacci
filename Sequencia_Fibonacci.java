package Sequencia_Fibonacci;

import java.util.Scanner;

public class Sequencia_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        int f1 = 0; // Primeiro número da sequência de Fibonacci
        int f2 = 1; // Segundo número da sequência de Fibonacci
        int limite = scanner.nextInt(); // Lê o limite máximo da sequência fornecido pelo usuário

        // Loop para calcular e exibir os números da sequência de Fibonacci
        while (f2 < limite) {
            int fn = f1 + f2; // Calcula o próximo número da sequência

            if (fn > limite) // Verifica se o próximo número ultrapassa o limite
                break; // Encerra o loop se o limite for ultrapassado
            
            System.out.println(fn); // Exibe o número atual da sequência
            f1 = f2; // Atualiza o valor de f1 para o próximo cálculo
            f2 = fn; // Atualiza o valor de f2 para o próximo cálculo
        }
    }
}
