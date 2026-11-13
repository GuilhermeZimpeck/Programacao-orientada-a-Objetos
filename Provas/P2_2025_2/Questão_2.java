class Main {

    public static void main(String[] args) {

        int resultado = contarPalavra("Java python java JAVA", "java");

        System.out.println(resultado);
    }

    public static int contarPalavra(String texto, String alvo) {

        String[] palavras = texto.split(" ");

        int contador = 0;

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].toLowerCase().equals(alvo)) {
                contador++;
            }
        }

        return contador;
    }
}
