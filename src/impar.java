import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o comeco da repeticao: ");
        int ini = sc.nextInt();
        System.out.println("Digite o fim da repeticao: ");
        int  end = sc.nextInt();
        int count;
        if (ini % 2 == 0){
            count = ini + 1;
        } else {
            count = ini;
        }
        while ( count <= end){
            System.out.println(count);
            count = count + 2;
        }
        System.out.println("Esses são os impares dessa repeticao");
    }
}
