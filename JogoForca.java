import java.util.Scanner;

public class JogoForca {
    final static Scanner SC = new Scanner(System.in);

    static void jogoForca(String palavraSecreta, String letras) {
        int vidas = 7, cont = 0;
        char[] palavraSecretaVet, letrasVet;
        boolean[] letrasAcerto;

        palavraSecretaVet = palavraSecreta.toCharArray();
        letrasVet = letras.toCharArray();
        letrasAcerto = new boolean[letrasVet.length];

        for (int i = 0; i < letrasAcerto.length; i++) {
            letrasAcerto[i] = false;
        }

        for (int i = 0; i < letrasVet.length; i++) {
            for (int j = 0; j < palavraSecretaVet.length; j++) {
                if (palavraSecretaVet[j] == letrasVet[i]) {
                    letrasAcerto[i] = true;
                }
            }
        }

        for (int i = 0; i < letrasAcerto.length; i++) {
            if (!letrasAcerto[i]) {
                vidas--;
            } else {
                cont++;
            }
        }

        if (vidas > 0 && cont == palavraSecretaVet.length) {
            System.out.println("acerto");
        } else if (vidas > 0) {
            System.out.println("continua");
        } else {
            System.out.println("perda");
        }
    }
    
    public static void main(String[] args) {
        String palavraSecreta, letras;
        palavraSecreta = SC.next();
        letras = SC.next();
        jogoForca(palavraSecreta, letras);
    }
}