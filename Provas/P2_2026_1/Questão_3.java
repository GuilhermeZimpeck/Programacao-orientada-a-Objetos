import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


// =====================================================
// A) CLASSE MedicaoEnergia
// =====================================================

class MedicaoEnergia {

    private String id;
    private String nome;
    private double energiaGerada;

    // Construtor com os três atributos
    public MedicaoEnergia(String id, String nome, double energiaGerada) {
        this.id = id;
        this.nome = nome;
        this.energiaGerada = energiaGerada;
    }

    // Getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }
}


// =====================================================
// B) SUBCLASSE MedicaoSolar
// =====================================================

class MedicaoSolar extends MedicaoEnergia {

    public MedicaoSolar(String id, String nome, double energiaGerada) {

        // Chama o construtor da classe mãe
        super(id, nome, energiaGerada);
    }
}


// =====================================================
// B) SUBCLASSE MedicaoEolica
// =====================================================

class MedicaoEolica extends MedicaoEnergia {

    public MedicaoEolica(String id, String nome, double energiaGerada) {

        // Chama o construtor da classe mãe
        super(id, nome, energiaGerada);
    }
}


// =====================================================
// C) CLASSE DE EXCEÇÃO ProcessamentoException
// =====================================================

class ProcessamentoException extends Exception {

    public ProcessamentoException(String mensagem) {

        // Envia a mensagem para o construtor da classe Exception
        super(mensagem);
    }
}


// =====================================================
// D) CLASSE Util
// =====================================================

class Util {

    public static Collection processa(List linhas)
            throws ProcessamentoException {

        // Cria uma coleção para armazenar as medições processadas
        Collection medicoes = new ArrayList();

        // Percorre todas as linhas recebidas
        Iterator it = linhas.iterator();

        while (it.hasNext()) {

            // Recupera a próxima linha da lista
            String linha = (String) it.next();

            // Conta quantos caracteres '#' existem na linha
            int quantidade = 0;

            for (int i = 0; i < linha.length(); i++) {

                if (linha.charAt(i) == '#') {
                    quantidade++;
                }
            }

            // Verifica se a linha possui exatamente dois '#'
            if (quantidade != 2) {

                // Lança uma exceção caso o formato esteja incorreto
                throw new ProcessamentoException(
                    "Formato incorreto: " + linha
                );
            }

            // Divide a String em três partes usando '#' como separador
            String[] partes = linha.split("#");

            // Recupera os três campos da linha
            String id = partes[0];
            String nome = partes[1];

            // Converte a energia de String para double
            double energia = Double.parseDouble(partes[2]);

            // Variável da classe mãe que poderá receber objetos das subclasses
            MedicaoEnergia medicao;

            // Verifica se o ID começa com a letra S
            if (id.startsWith("S")) {

                // Cria uma medição solar
                medicao = new MedicaoSolar(id, nome, energia);

            } else {

                // Cria uma medição eólica
                medicao = new MedicaoEolica(id, nome, energia);
            }

            // Adiciona a medição criada à coleção
            medicoes.add(medicao);
        }

        // Retorna a coleção com todas as medições
        return medicoes;
    }
}


// =====================================================
// E) CLASSE PRINCIPAL
// =====================================================

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista que armazenará as linhas digitadas pelo usuário
        List linhas = new ArrayList();

        String linha;

        // Lê linhas até o usuário digitar "fim"
        while (true) {

            linha = sc.nextLine();

            // Encerra a leitura sem armazenar a palavra "fim"
            if (linha.equals("fim")) {
                break;
            }

            // Armazena a linha na lista
            linhas.add(linha);
        }

        try {

            // Processa as linhas e recebe a coleção de medições
            Collection medicoes = Util.processa(linhas);

            double soma = 0;
            int quantidade = 0;

            // Cria um Iterator para percorrer as medições
            Iterator it = medicoes.iterator();

            while (it.hasNext()) {

                // Recupera a próxima medição
                MedicaoEnergia m = (MedicaoEnergia) it.next();

                // Soma a energia gerada pela medição atual
                soma += m.getEnergiaGerada();

                // Conta quantas medições existem
                quantidade++;
            }

            // Calcula e exibe a média
            if (quantidade > 0) {

                double media = soma / quantidade;

                System.out.println("Media de energia gerada: " + media);
            }

        } catch (ProcessamentoException e) {

            // Exibe a mensagem da exceção caso alguma linha esteja incorreta
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
