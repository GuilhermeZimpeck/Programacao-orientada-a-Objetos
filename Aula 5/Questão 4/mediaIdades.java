import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] pessoas = new String[1000];
        int quantidade = 0;
        int somaIdades = 0;

        System.out.println("Digite cada linha no formato: nome#idade");
        System.out.println("Para encerrar, digite exatamente: finalizar");

        while (quantidade < 1000) {

            String linha = sc.nextLine();

            // Verifica se o usuário quer encerrar
            if (linha.equals("finalizar")) {
                break;
            }

            // Separa nome e idade
            String[] dados = linha.split("#");

            String nome = dados[0];
            int idade = Integer.parseInt(dados[1]);

            // Verifica se a idade é negativa
            if (idade < 0) {
                System.out.println("A idade não pode ser negativa.");
                continue;
            }

            // Guarda a linha no array
            pessoas[quantidade] = linha;
            quantidade++;

            // Soma a idade para calcular a média depois
            somaIdades += idade;
        }

        // Calcula a média
        double media = 0;

        if (quantidade > 0) {
            media = (double) somaIdades / quantidade;
        }

        System.out.println("Média das idades: " + media);

        sc.close();
    }
}
