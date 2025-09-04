import java.util.Scanner;

// rm Second.class && javac Second.java && java Second < ok.txt

public class Second {
    final static Scanner SC = new Scanner(System.in);

    static void tesouro(int[] a, int s) {
        int as=0, v=s;
        while (true) {
            v=s;
            if (as > a.length) {
                System.out.println("Não há tesouro");
                break;
            }
            if (a[s] == -1) {
                System.out.printf("O tesouro está na posição %d\n", v);
                break;
            }
            s = a[s];
            as++;
        }
    }

    public static void main(String[] args) {
        int [] a = {1, 5, 7, -1, 3, 4};
        int s = 0;
        // a = new int[SC.nextInt()];
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = SC.nextInt();
        // }
        // s = SC.nextInt();
        tesouro(a, s);
    }
}