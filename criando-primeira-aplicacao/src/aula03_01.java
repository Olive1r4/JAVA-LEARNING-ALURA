import java.util.Scanner;

public class aula03_01 {
    public static void main(String[] args) {
        /* 1.Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num >= 0){
            System.out.println("O número digitado é PAR.");
        }
        else {
            System.out.println("O número digitado é IMPAR.");
        }
        sc.close();
    }
}
