public class Exercicio02 {
    public static void main(String[] args) {
        int[] v = {5, 3, 8, 1, 9, 4, 7};

        for (int i= 0; i <v.length; i++); {
            System.out.println("Primeiro: " + v[0]);
            System.out.println("Último:   " + v[v.length - 1]);
            System.out.println("Central:  " + v[v.length / 2]);
        }
    }
}
