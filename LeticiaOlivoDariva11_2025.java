import java.util.Scanner;

public class LeticiaOlivoDariva11_2025{
    final static Scanner TECLADO = new Scanner(System.in);

    public static char lerResposta(){
        String resposta;
        char respostaAdequada;
        
        do{

            resposta = TECLADO.nextLine();
            respostaAdequada = resposta.charAt(0);
            
        }while(respostaAdequada != 'S' && respostaAdequada != 'N');
        return respostaAdequada;
    }
    public static void main(String[] args){//97 a 122
        //String escolherAnimal = "a b c\n d e f\n g h i\n j k l\n m n o\n p q r\n s t u\n v w x\n y z A\n B C D\n";
        String[] mostraCartas = new String[5];
        int valorASCII = 97;
        char letras;
        char respostaUsuario;
        int soma = 0;
        char caracterFinal;

        mostraCartas[0]=    "\t\t\t _______________________\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   a   |   c   |   e   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +         
                            "\t\t\t|   g   |   i   |   k   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   m   |   o   |   q   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   s   |   u   |   w   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   y   |   {   |   }   |\n" +
                            "\t\t\t|_______|_______|_______|\n";

        mostraCartas[1]=    "\t\t\t _______________________\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   b   |   c   |   f   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   g   |   j   |   k   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   n   |   o   |   r   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   s   |   v   |   w   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   z   |   {   |   ~   |\n" +
                            "\t\t\t|_______|_______|_______|\n";

        mostraCartas[2]=    "\t\t\t _______________________\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   d   |   e   |   f   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   g   |   l   |   m   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   n   |   o   |   t   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   u   |   v   |   w   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   {   |   |   |   }   |\n" +
                            "\t\t\t|_______|_______|_______|\n";

        mostraCartas[3]=    "\t\t\t _______________________\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   h   |   i   |   j   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   k   |   l   |   m   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   n   |   o   |   x   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   y   |   z   |   {   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   |   |   }   |   ~   |\n" +
                            "\t\t\t|_______|_______|_______|\n";

        mostraCartas[4]=    "\t\t\t _______________________\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   p   |   q   |   r   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   s   |   t   |   u   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   v   |   w   |   x   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   y   |   z   |   {   |\n" +
                            "\t\t\t|_______|_______|_______|\n" +
                            "\t\t\t|       |       |       |\n" +
                            "\t\t\t|   |   |   }   |   ~   |\n" +
                            "\t\t\t|_______|_______|_______|\n";


        
        System.out.printf("\n\t  Escolha um caracter dos que vou lhe mostrar e o decore.\n\n\t\t\t\t  ");

        for(int cont = 0; cont < 30; cont++){  
            letras = (char) valorASCII;
            valorASCII++;

            System.out.printf("%c ",letras);

            if(letras %3 == 0){
                
                System.out.printf("\n\t\t\t\t  ");
            }
        }
        System.out.printf("\n\t Agora vou lhe mostra algumas cartas e você precisa digitar\n\tS quando a carta tem o seu caracter escolhido e N para quando\n\t\ta carta não tem o caracter que você escolheu.\n");
        
        for(int i = 0; i > 5; i++){
            
            System.out.println(mostraCartas[i]);
            respostaUsuario = lerResposta();
            
            if(respostaUsuario == 'S'){
                soma *= 2;
            }
        }

        for(int i = 0; i <= 30; i++){
            valorASCII = 97;
            switch (soma) {
                case 1:
                    valorASCII += i;
                    
                case 2:
                    
                    
                    break;
            
                default:
                    break;
            }
        }

    }
}// String.valueOf(MostraImagens)