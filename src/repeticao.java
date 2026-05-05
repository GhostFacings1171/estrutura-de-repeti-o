import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comeco da repeticao: ");
        int ini = sc.nextInt();
        System.out.println("Digite o fim da repeticao: ");
        int end = sc.nextInt();
        while (ini <= end){
            System.out.println(ini);
            ini++;
        }
    }
}
