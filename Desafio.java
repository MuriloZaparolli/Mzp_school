import java.util.Scanner;

public class Desafio {
    final static Scanner SC = new Scanner(System.in);

    static void metodo(double nota1, double nota2, String nome, double media) {
        double mediaAlunos = (nota1 + nota2)  / 2;

        if (nota1 < 4 || nota2 < 4 || mediaAlunos < media) {
            System.out.println(nome);
        }
    }

    static double nn(String nome, double nota1, double nota2) {
        double soma=0;
        
        return soma;
    }

    public static void main(String[] args) {
        int n = SC.nextInt();
        double soma=0, media;
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = SC.next();
            notas1[i] = SC.nextDouble();
            notas2[i] = SC.nextDouble();

            soma += notas1[i] + notas2[i];
        }

        media = soma / (2*n);
        System.out.printf("Média da turma: %.2f\n", media);

        for (int i = 0; i < n; i++) {
            metodo(notas1[i], notas2[i], nomes[i], media);
        }
    }
}