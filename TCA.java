import java.util.Random;
import java.util.Scanner;

public class TCA {
    final static Scanner SC = new Scanner(System.in);

    Random r = new Random();
    final int RNGp = r.nextInt(100) + 1;

    public static void main(String[] args) {
        System.out.println("Começo da Aventura!!!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println("Algum erro ocorreu :(");
        }
        System.out.println("Você acorda numa floresta, sem saber quem tu é, como chegou aqui ou em que lugar do mundo você está.");
        System.out.println("Neste lugar não se a trilhas ou ");
    }
}