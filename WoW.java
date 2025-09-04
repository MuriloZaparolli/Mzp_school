import java.util.Random;

public class WoW {

    public static void gotoXY(int linha, int coluna) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, linha, coluna));
    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }

    public static void setColor(int cor) {
        String s = "[0m";
        switch (cor) {
            case 0:
                s = "[30m";// preto
                break;
            case 1:
                s = "[31m";// vermelho
                break;
            case 2:
                s = "[32m";// verde
                break;
            case 3:
                s = "[303m";// amarelo
                break;
            case 4:
                s = "[34m";// azul
                break;
            case 5:
                s = "[35m";// magenta
                break;
            case 6:
                s = "[36m";// ciano
                break;
            case 7:
                s = "[97m";// branco
                break;
        }

        System.out.print((char) 27 + s);
    }


    public static void asciiArt(){
        limparTela();
        System.out.println("  Bom dia!");
        System.out.println("                  {}");
        System.out.println("  ,   A           {}");
        System.out.println(" / \\, | ,        .--.");
        System.out.println("|  =|= >        /.--.\\");
        System.out.println(" \\ /` | `       |====|");
        System.out.println("  `   |         |`::`|");
        System.out.println("      |     .-;`\\..../`;_.-^-._");
        System.out.println("     /\\\\/  /  |...::..|`   :   `|");
        System.out.println("     |:'\\ |   /'''::''|   .:.   |");
        System.out.println("      \\ /\\;-,/\\   ::  |..ASCII..|");
        System.out.println("      |\\ <` >  >._::_.| ':ART:' |");
        System.out.println("      | ``_/  |^^/>/> |   ':'   |");
        System.out.println("      |       |       \\    :    /");
        System.out.println("      |       |        \\   :   /");
        System.out.println("      |       |___/\\___|`-.:.-`");
        System.out.println("      |        \\_ || _/    `");
        System.out.println("      |        <_ >< _>");
        System.out.println("      |        |  ||  |");
        System.out.println("      |        |  ||  |");
        System.out.println("      |       _\\.:||:./_");
        System.out.println("      |      /____/\\____\\");
        System.out.println("");
        System.out.println(".:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:\n");
    }

    public static void main(String[] args) {
        int linha, coluna, cor;
        int TAM_LINHA = 30;
        int TAM_COLUMA = 160;
        int NUM_CORES = 8;

        // gerador de numeros aleatorios
        Random gerador = new Random();

        limparTela();

        // laço de repetição
        for (int i = 0; i < 10000; i++) {

            // linha, coluna e cor aleatória
            linha = gerador.nextInt(TAM_LINHA);
            coluna = gerador.nextInt(TAM_COLUMA);
            cor = gerador.nextInt(NUM_CORES);
            // vai para a posição desejada
            gotoXY(linha, coluna);
            // escolhe a cor
            setColor(cor);
            // System.out.print("oi");
            System.out.print((char) (gerador.nextInt(26) + 'A'));
            try {
                Thread.sleep(3); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                // Trata a exceção, por exemplo, registrando o erro ou tomando alguma ação alternativa
                e.printStackTrace();
            }

        }

        asciiArt();

        setColor(-1); // escolhe cor branca
    }
}
