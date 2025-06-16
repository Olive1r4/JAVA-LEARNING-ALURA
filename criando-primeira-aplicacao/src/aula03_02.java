import java.util.Scanner;

public class aula03_02 {
    public static void main(String[] args) {
        /*
        Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
        se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros");
        System.out.print("Primeiro: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Os números digitados são iguais.");
        }else if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior que o segundo.");
        }else {
            System.out.println("O segundo número digitado é maior que o primeiro.");
        }
        sc.close();
    }
}
