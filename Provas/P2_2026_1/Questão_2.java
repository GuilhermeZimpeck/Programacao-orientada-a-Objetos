import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

class Projeto {

    private String titulo;
    private double valorFinanciamento;

    public Projeto(String titulo, double valorFinanciamento) {
        this.titulo = titulo;
        this.valorFinanciamento = valorFinanciamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }
}

class GrupoPesquisa {

    private String codigo;
    private String nome;
    private ArrayList projetos;

    public GrupoPesquisa(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.projetos = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList projetos) {
        this.projetos = projetos;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        GrupoPesquisa grupo1 = new GrupoPesquisa("g01", "Liga de Computacao");
        GrupoPesquisa grupo2 = new GrupoPesquisa("g02", "Liga de Matematica");

        Projeto proj1 = new Projeto("Computacao Quantica", 100);
        Projeto proj2 = new Projeto("Computacao Avancada", 50);

        Projeto proj3 = new Projeto("Calculo 0", 120);
        Projeto proj4 = new Projeto("Algebra Linear", 80);

        grupo1.getProjetos().add(proj1);
        grupo1.getProjetos().add(proj2);

        grupo2.getProjetos().add(proj3);
        grupo2.getProjetos().add(proj4);

        map.put(grupo1.getCodigo(), grupo1);
        map.put(grupo2.getCodigo(), grupo2);

        relatorioDeFinanciamento(map);
    }

    public static void relatorioDeFinanciamento(HashMap mapa) {

        // Obtém as chaves do HashMap e cria um Iterator para percorrê-las
        Iterator it = mapa.keySet().iterator();

        // Enquanto existir uma próxima chave
        while (it.hasNext()) {

            // Obtém a próxima chave e avança o Iterator
            Object chave = it.next();

            // Utiliza a chave para recuperar o GrupoPesquisa correspondente
            GrupoPesquisa grupo = (GrupoPesquisa) mapa.get(chave);

            // Inicializa a soma dos financiamentos
            double soma = 0;

            // Obtém a lista de projetos pertencente ao grupo atual
            ArrayList projetos = grupo.getProjetos();

            // loop da arraylist
            for (int i = 0; i < projetos.size(); i++) {

                Projeto p = (Projeto) projetos.get(i);

                soma += p.getValorFinanciamento();
            }
            System.out.println(grupo.getNome() + " - " + soma);
        }
    }
}
