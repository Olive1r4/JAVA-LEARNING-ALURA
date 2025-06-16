public class Media {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 8.7;
        double nota2 = 5.5;
        double resultado = (nota1 + nota2)/2;
        System.out.println("Média entre as nota 1 e nota 2 = " + resultado);

        /*
        Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int
        e imprima o resultado.
        */
        int var1 = 8;
        double var2 = 5.5;
        int resultado2 = (var1 + (int) var2)/2;
        System.out.println("Média entre as nota 1 e nota 2 = " + resultado2);

        /*
        Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
         Atribua valores a essas variáveis e concatene-as em uma mensagem.
        */
        char letra = 'é';
        String palavra = " Java ";
        System.out.println(palavra + letra + " uma bosta");

        /*
        Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        */
        double precoProduto = 5.55;
        int quantidade = 12;
        double valorTotal = precoProduto*quantidade;
        System.out.println("Valor total: "+valorTotal);

        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         */
        double valorEmDolares =  4.94;
        double valorEmReais = 100;
        double conversao = valorEmDolares * valorEmReais;
        System.out.printf("Valor em reais: %.2f\n", conversao);

        /*
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal = 12.30;
        double percentualDesconto = 10;
        double valorComDescondo = precoOriginal - (precoOriginal*(percentualDesconto/100));
        System.out.printf("Valor com desconto: %.2f\n", valorComDescondo);
    }
}
