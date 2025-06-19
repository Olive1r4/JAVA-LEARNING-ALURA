import java.util.Scanner;

public class aula03_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        int fat = num;

        for (int i = num-1; i > 0 ; i--) {
            fat = fat * i;
        }
        System.out.println(num +"! = "+ fat);
        sc.close();
    }
}
