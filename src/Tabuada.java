import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int resposta=1;
        while (resposta == 1 ){
        System.out.println("Valor: ");
        int valor = sc.nextInt();
        while (contador <= 10) {
            int resultado = valor * contador;
            System.out.println(valor + " * " + contador + " = " + resultado);
            contador++;
        }
        System.out.println("Digite 1 para nova tabuada ou 0 para finalizar");
        resposta = sc.nextInt();
        }
    }
}
