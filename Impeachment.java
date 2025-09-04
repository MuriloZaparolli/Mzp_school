import java.util.Scanner;

public class Impeachment {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n, v, vt;
        float m;
        while (SC.hasNext()) {
            n = SC.nextInt();
            vt=0;
            for (int i=0; i<n; i++) {
                v=SC.nextInt();
                if (v == 1) {
                    vt++;
                }
            }
            m = (float)n*2/3;
            if (vt >= m) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }
    }
}