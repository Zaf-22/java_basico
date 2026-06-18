public class Exercicio05 {
    public static void main(String[] args) {

        // Vetor de números inteiros
        int[] indices = {3, 7, 1, 9, 4, 6, 2, 8, 5};

        // Percorre o array começando no índice 1
        // i += 2 faz pular de 2 em 2 (1, 3, 5, 7...)
        //length = tamanho; em array = quantidade de elementos; em String = quantidade de letras
        for (int i = 1; i < indices.length; i += 2) {

            // Mostra o índice e o valor armazenado naquela posição
            System.out.println("v[" + i + "] = " + indices[i]);
            //
        }
    }
}