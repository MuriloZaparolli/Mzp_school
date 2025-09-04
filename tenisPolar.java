import java.util.Scanner;

public class tenisPolar {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        String chave1 = SC.next(), chave2 = SC.next();
        String frase = SC.next();
        char[] fraseVet = frase.toCharArray();
        char[] chave1Vet = chave1.toCharArray();
        char[] chave2Vet = chave2.toCharArray();
        for (int i = 0; i<fraseVet.length; i++) {
            for (int j = 0; j < chave1Vet.length; j++) {
                if (fraseVet[i] == chave1Vet[j]) {
                    fraseVet[i] = chave2Vet[j];
                } else if (fraseVet[i] == chave2Vet[j]) {
                    fraseVet[i] = chave1Vet[j];
                }
            }
        }
        frase = new String(fraseVet);
        System.out.println(frase);
    }
}