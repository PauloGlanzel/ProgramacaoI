
package arraysboolean;

import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class ArraysBoolean {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] estudAprovProgI = {true, false, true, false, true};
        /*
        for(int i=0; i < estudAprovProgI.length; i++){
            System.out.print("Digite 'true' ou 'false' para o aluno "+i+".: ");
            estudAprovProgI[i] = Boolean.getBoolean(sc.next());
        }*/
        System.out.println("");
        System.out.println("Valores digitados.:");
        for(int i=0; i < estudAprovProgI.length; i++){
            System.out.print(estudAprovProgI[i]+" - ");
        }
    }
    
}
