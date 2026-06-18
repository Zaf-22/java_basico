import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        String [] estados = {"São Paulo",  "Rio", "Curitiba", "Salvador", "Fortaleza"};
        for ( String estado : estados) {
            //O for-each em Java é uma forma simplificada de percorrer arrays ou listas sem precisar usar índice.
            //O método toUpperCase() em Java serve para transformar todas as letras de uma String em maiúsculas.
            System.out.println(estado.toUpperCase());
        }

    }
}

