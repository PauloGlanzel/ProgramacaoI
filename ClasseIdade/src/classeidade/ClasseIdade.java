
package classeidade;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class ClasseIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[10];
        int cont = 1;
        for(int i=0; i<idade.length; i++){
            System.out.print("Digite a "+cont+"ª idade.: ");
            idade[i] = sc.nextInt();
            cont += 1;
        }
        System.out.println("");
        System.out.println("Valores digitados.:");
        for(int i=0; i < idade.length; i++){
            System.out.print(idade[i]+" - ");
        }
        Arrays.sort(idade);
        System.out.println("");
        System.out.println("Valores digitados em ordem crescente.:");
        for(int i=0; i < idade.length; i++){
            System.out.print(idade[i]+" - ");
        }
    }
    
}
