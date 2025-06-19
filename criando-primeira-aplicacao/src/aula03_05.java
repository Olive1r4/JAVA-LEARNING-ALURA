import java.util.Scanner;

public class aula03_05 {
    public static void main(String[] args) {
        /*
            5. Crie um programa que solicite ao usuário a entrada de um número inteiro.
            Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if ( num % 2 == 0){
            System.out.println("O número digitado é PAR.");
        }else {
            System.out.println("O número digitado é IMPAR.");
        }
        sc.close();
    }
}
