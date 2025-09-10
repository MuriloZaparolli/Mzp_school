import java.util.Random;
import java.util.Scanner;

// rm Main.class && javac Main.java && java Main < mzpp.txt
// java Main < mzpp.txt

public class Vets {
    final static Scanner SC = new Scanner(System.in);

    static double maiorVet(double[] vet) {
        double maiorVet = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maiorVet) {
                maiorVet = vet[i];
            }
        }
        return maiorVet;
    }

    static double menorVet(double[] vet) {
        double menorVet = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menorVet) {
                menorVet = vet[i];
            }
        }
        return menorVet;
    }

    static int maiorIndiceVet(double[] vet) {
        double maiorVet = vet[0];
        int indice=0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maiorVet) {
                maiorVet = vet[i];
                indice = i;
            }
        }
        return indice;
    }

    static int menorIndiceVet(double[] vet) {
        double menorVet = vet[0];
        int indice=0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menorVet) {
                menorVet = vet[i];
                indice = i;
            }
        }
        return indice;
    }

    static double[] maiorEMenorVet(double[] vet) {
        double[] mEn = new double[2];
        mEn[0] = maiorVet(vet);
        mEn[1] = menorVet(vet);
        return mEn;
    }

    static int[] indiceMaiorEMenorVet(double[] vet) {
        int[] mEn = new int[2];
        mEn[0] = maiorIndiceVet(vet);
        mEn[1] = menorIndiceVet(vet);
        return mEn;
    }

    static void soutVet(double[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %.2f\n", i, vet[i]);
            }
        }
    }

    static void soutVet(int[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %d\n", i, vet[i]);
            }
        }
    }

    static void soutVet(char[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %c\n", i, vet[i]);
            }
        }
    }

    static void soutVet(float[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %.2f\n", i, vet[i]);
            }
        }
    }

    static void soutVet(String[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %s\n", i, vet[i]);
            }
        }
    }

    static void soutVet(short[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %d\n", i, vet[i]);
            }
        }
    }

    static void soutVet(long[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %d\n", i, vet[i]);
            }
        }
    }
    static void soutVet(byte[] vet) {
        if (vet == null) {
            System.out.println("vetor nulo");
        } else {
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("[%d] -> %d\n", i, vet[i]);
            }
        }
    }

    static void scVet(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            // System.out.println("Nota:");
            vet[i] = SC.nextDouble();
        }
    }

    static boolean estaVet(double[] vet, double valor) {
        boolean ifs = false;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valor) {
                ifs = true;
                break;
            }
        }
        return ifs;
    }

    static int contLetrasEmFrase(String f, char l) {
        char[] c = f.toCharArray();
        int cont=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == l) {
                cont++;
            }
        }
        return cont;
    }

    static void ts2() {
        String frase;
        char letra;
        int quant;
        System.out.println("Digite uma frase");
        frase = SC.nextLine();
        System.out.println("Digite uma letra");
        letra = SC.next().charAt(0);
        quant = contLetrasEmFrase(frase, letra);
        System.out.printf("A letra %c aparece %d vez(es) na frase:\n%s\n", letra, quant, frase);
    }

    static void ts1() {
        double[] notas;
        System.out.println("Quantas notas seram lidas?");
        notas = new double[SC.nextInt()];
        scVet(notas);
        soutVet(notas);
        System.out.printf("Maior nota: %.2f -> [%d]\nMenor nota: %.2f -> [%d]\n", maiorVet(notas), maiorIndiceVet(notas), menorVet(notas), menorIndiceVet(notas));
        if (estaVet(notas, 0)) {
            System.out.println("O valor está no vetor");
        } else {
            System.out.println("");
        }
    }

    static double[] trocaValVet(double[] vet, int pos1, int pos2) {
        if (vet == null || pos1 > vet.length || pos2 > vet.length || pos1 < 0 || pos2 < 0) {
            return null;
        }

        double temp = vet[pos1];
        vet[pos1] = vet[pos2];
        vet[pos2] = temp;
        return vet;
    }

    static double[] recorteVet(double[] vet, int posI, int posF) {
        if (vet == null || posI >= vet.length || posF >= vet.length || posI < 0 || posF < 0) {
            return null;
        }

        double[] recorte = new double[posF - posI + 1];
        for (int i = 0; i < recorte.length; i++) {
            recorte[i] = vet[i + posI];
        }
        return recorte;
    }

    static double[] concatenarVet(double[] vet1, double[] vet2) {
        if (vet1 == null || vet2 == null) {
            return null;
        }

        double[] concatenado = new double[vet1.length + vet2.length];
        for (int i = 0; i < vet1.length; i++) {
            concatenado[i] = vet1[i];
        }
        for (int i = 0; i < vet2.length; i++) {
            concatenado[i+vet1.length] = vet2[i];
        }
        return concatenado;
    }

    static double[] somaVet(double[] vet1, double[] vet2) {
        if (vet1 == null || vet2 == null || vet1.length != vet2.length) {
            return null;
        }

        double[] somVet = new double[vet1.length];
        for (int i = 0; i < somVet.length; i++) {
            somVet[i] = vet1[i] + vet2[i];
        }
        return somVet;
    }

    static int[] ramdomGenerateVet(int vetLength, int limit) {
        Random r = new Random();
        int[] vet = new int[vetLength];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(limit+1);
        }
        return vet;
    }

    static int[] obterHistograma0_9(int[] vet) {
        if (vet==null) {
            return null;
        }

        int[] histograma = new int[10];

        for (int i = 0; i < histograma.length; i++) {
            histograma[i] = 0;
        }

        for (int i = 0; i < histograma.length; i++) {
            histograma[vet[i]]++;
        }

        return histograma;
    }

    static int[] intercalarVet(int[] vet1, int[] vet2) {
        if (vet1 == null || vet2 == null || vet1.length != vet2.length) {
            return null;
        }

        return null;
    }

    public static void main(String[] args) {
        int[] vet = ramdomGenerateVet(20, 9);
        soutVet(vet);
        soutVet(obterHistograma0_9(vet));
    }
}
