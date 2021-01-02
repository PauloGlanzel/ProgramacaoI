
package arrays;

import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = new String[12];
        for(int i=0; i < meses.length; i++){
            int m = i + 1;
            System.out.print("Digite o nome do "+m+"º mês do ano.: ");
            meses[i] = sc.next();
        }
        System.out.println("Valores digitados.:");
        for(int i=0; i < meses.length; i++){
            System.out.println(meses[i]);
        }                
    }
    
}
