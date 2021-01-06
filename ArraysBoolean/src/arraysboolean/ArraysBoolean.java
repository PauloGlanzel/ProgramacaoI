
package arraysboolean;

import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class ArraysBoolean {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean[] estudAprovProgI = new Boolean[5];
        int a = 1;
        
        for(int i=0; i < estudAprovProgI.length; i++){
            System.out.print("Digite 'true' ou 'false' para o "+a+"º aluno.: ");
            estudAprovProgI[i] = sc.nextBoolean();
            a += 1;
        }
        System.out.println("");
        System.out.println("Valores digitados.:");
        for(int i=0; i < estudAprovProgI.length; i++){
            System.out.print(estudAprovProgI[i]+" - ");
        }       
    }    
}
