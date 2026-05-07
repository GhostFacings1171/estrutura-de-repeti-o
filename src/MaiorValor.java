import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int contador = 1; // Controla quantos números foram lidos

        System.out.println("Digite 15 números:");

        // Loop while para ler 15 números
        while (contador <= 15) {
            System.out.print("Número " + contador + ": ");
            int numero = scanner.nextInt();

            // Verifica se é maior que o atual maior
            if (numero > maior) {
                maior = numero;
            }

            contador++; // Incrementa o contador
        }

        System.out.println("\nO maior valor informado é: " + maior);

        scanner.close();
    }
}
