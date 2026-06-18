public class Exercicio03 {
    public static void main(String[] args) {
        // 1. Criação do vetor de 5 posições usando 'new int[5]'
        int[] quadrados = new int[5];

        // 2. Laço 'for' para preencher o vetor com o quadrado do índice
        for (int i = 0; i < quadrados.length; i++) {
            quadrados[i] = i * i; // Eleva o índice atual ao quadrado
        }

        // 3. Laço 'for' para imprimir os valores do vetor
        for (int i = 0; i < quadrados.length; i++) {
            System.out.println("posicao " + i + " = " + quadrados[i]);
            //

        }
    }
}