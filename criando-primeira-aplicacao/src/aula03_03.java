import java.util.Scanner;

public class aula03_03 {
    public static void main(String[] args) {
        /*
        Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
         Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("Ou precione qualquer outra tecla para sair.");

        int op = sc.nextInt();

        if (op == 1){
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = sc.nextDouble();
            System.out.printf("Area do quadrado: %.2f\n",(lado*lado) );
        } else if (op == 2) {
            System.out.print("Digite o valor do raio do círculo: ");
            double raio = sc.nextDouble();
            System.out.printf("Area do círculo: %.2f\n",(Math.PI*(Math.pow(raio,2))) );
        } else {
            System.out.println("Usuário optou por sair do programa!!!");
        }
        sc.close();
    }
}
