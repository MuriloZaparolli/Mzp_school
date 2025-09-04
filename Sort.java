import java.util.Scanner;

public class Sort {
    final static Scanner SC = new Scanner(System.in);

    public static int[] trocarPosicoesVetor(int[] vet, int i, int j) {
        int temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
        return vet;
        }

    public static void bubbleSort(int[] vet) {
        for (int j = 0; j < vet.length; j++) {
            for (int i = 0; i < vet.length - 1 - j; i++) {
                if (vet[i] > vet[i + 1]) {
                    vet = trocarPosicoesVetor(vet, i, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vet = new int[SC.nextInt()];
        for (int i=0; i<vet.length; i++) {
            vet[i] = SC.nextInt();
        }
        bubbleSort(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[%d] -> %d\n", i, vet[i]);
        }
    }
}