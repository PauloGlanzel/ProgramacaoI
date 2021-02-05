
package grelhacardano;

import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class GrelhaCardano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mensagem  = {{"A","I","O","N","T","R","I","E","S","P","Q","R","X","Z","Y"},
                                {"E","S","S","T","T","A","M","R","E","M","N","I","O","X","S"},
                                {"A","A","C","B","O","N","I","T","O","I","H","G","O","A","I"},
                                {"T","U","V","X","Z","A","B","C","D","E","S","T","S","R","Q"},
                                {"L","N","M","J","M","K","F","D","T","I","N","H","I","A","A"},
                                {"P","F","A","H","M","N","I","T","D","X","Y","A","E","O","Y"},
                                {"N","V","A","O","E","I","L","M","P","Q","O","R","S","T","A"},
                                {"X","U","Y","W","O","P","Q","A","R","U","K","S","E","T","T"},
                                {"D","F","I","G","M","K","S","O","A","I","H","G","Q","M","P"},
                                {"X","S","E","H","E","K","M","B","V","P","W","R","E","U","Z"},
                                {"S","K","L","E","U","V","V","A","R","S","E","N","T","D","I"},
                                {"C","S","V","T","O","U","M","N","H","I","W","G","O","E","A"},
                                {"S","S","M","O","W","I","H","A","D","N","L","Y","Z","H","A"},
                                {"C","A","Q","M","H","A","D","B","I","J","S","K","A","U","E"},
                                {"T","V","Z","E","R","Y","M","P","E","I","L","H","H","U","A"},
                                };
        boolean[][] grelha = {{false, true, false,  true,  true, false, false, true, false, false, false, true, false, false, false},
                              {true, false, true, true, false, true, false, true, true, true, false, false, true, false, true},
                              {false, false, true, false, true, true, false, true, false, true, false, true, true, false, false},
                              {true, true, false, false, false, false, false, false, false, true, true, false, false, false, false},
                              {false, false, false, false, true, false, false, false, false, true, true, true, false, false, true},
                              {true, false, true, false, false, false, true, false, false, true, false, true, false, true, false},
                              {true, false, true, true, false, true, false, true, true, false, true, true, false, true, true},
                              {false, false, false, false, true, false, true, false, false, true, false, false, true, false, false},
                              {true, false, true, true, false, false, false, false, true, false, false, false, false, true, false},
                              {false, true, false, false, true, false, true, false, false, true, false, true, true, false, false},
                              {false, false, true, true, false, true, false, true, true, false, true, false, false, false, true},
                              {true, false, false, false, true, false, true, false, false, true, false, true, true, false, false},
                              {false, false, true, false, false, true, false, false, false, true, false, false, false, true, true},
                              {true, true, false, true, false, false, false, false, true, false, true, false, true, false, false},
                              {false, true, false, true, true, false, true, false, true, false, true, false, true, false, true}
                             };
        System.out.println("Mensagem cifrada.:");
        for(int i = 0; i < mensagem.length; i++){
            for(int j = 0; j < mensagem[0].length; j++){
                System.out.print(mensagem[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.print("\nPara decifrar a mensagem digite qquer tecla e [enter].:");
        sc.next();
        System.out.println("\nMensagem decifrada.: \n");
        
        for(int i = 0; i < grelha.length; i++){
            for(int j = 0; j < grelha[0].length; j++){
                if(grelha[i][j]){
                    System.out.print(mensagem[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
