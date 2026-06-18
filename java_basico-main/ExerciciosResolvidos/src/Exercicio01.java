public class Exercicio01 {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor usando sintaxe literal
        int[] numeros = {10, 20, 30, 40, 50};

        // Laço para percorrer o vetor e imprimir o índice e o valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}