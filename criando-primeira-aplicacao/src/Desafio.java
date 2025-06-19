import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String nome = "Fernando Oliveira";
        String tipoConta = "Corrente";
        double saldo = 3500.00;

        System.out.println("*******************************");
        System.out.println("Dados iniciais do cliente:\n\nNome: "+ nome +"\nTipo conta: "+ tipoConta +"\nSaldo inicial: R$ "+ saldo);
        System.out.println("*******************************");
        System.out.println();

        String menu = """
                *** Operações Disponíveis ***
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- sair
                
                >>> Digite a opção desejada:\s""";

        double valorRecebido, valorTransferido;

        while (true) {
            System.out.print(menu);

            int op = sc.nextInt();
            System.out.println();

            if (op < 1 || op > 4){
                System.out.println("Opção Inválida");
                System.out.println();
            } else if (op == 1) {
                System.out.printf("O saldo atual é R$ %.2f", saldo);
                System.out.println();
                System.out.println();
            } else if (op == 2) {
                System.out.print("Digite o valor recebido: R$ ");
                valorRecebido = sc.nextDouble();
                saldo = saldo + valorRecebido;
                System.out.println();
                System.out.println("O saldo atualizado é R$ "+ saldo +"\n");

            } else if (op == 3) {
                System.out.print("Digite o valor a ser transferido: R$ ");
                valorTransferido  = sc.nextDouble();
                System.out.println();
                if (valorTransferido > saldo){
                    System.out.println("Valor digitado é maior do que o saldo em conta!!!");
                    System.out.println("Valor atual da conta: R$ "+ saldo +"\n");
                    System.out.println();
                }else {
                    saldo -= valorTransferido;
                    System.out.println("O saldo atualizado é R$ "+ saldo +"\n");
                    System.out.println();
                }
            } else {
                System.out.print("Saindo...");
                break;
            }
        }
        sc.close();

    }
}
