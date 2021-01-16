
package tarefavetores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Paulo Glanzel
 */
public class TarefaVetores {

    public static void main(String[] args) throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        System.out.println("**********  Tarefa Vetores   **********");
        System.out.println("Ler palavra ou frase, armazenar em um vetor e");
        System.out.println("verificar se corresponde a um PALINDROMO.");
        System.out.println();
        boolean sim = true;
        while(sim){
            System.out.print("Digite uma palavra/frase.: ");
            String semEspaco = "";

            String palavra = toUpperCase(d.readLine());

            String[] palavraSplit = palavra.split(" ");

            for(int i=0; i< palavraSplit.length; i++){
                semEspaco += palavraSplit[i];
            }
            String [] arraySemEspaco = new String[semEspaco.length()];
            for(int i =0; i<semEspaco.length(); i++){
                arraySemEspaco[i] = Character.toString(semEspaco.charAt(i));
            }

            
            String semEspacoInvertido = "";
            for(int i = arraySemEspaco.length -1 ; i >= 0; i--){
                semEspacoInvertido += arraySemEspaco[i];
            }

            if(semEspaco.equals(semEspacoInvertido)){
                System.out.print("- É Palíndromo -");
            }else{
                System.out.print("- Não é Palíndromo -");
            }
            int s;
            System.out.println("");
            System.out.print("Deseja Testar outra Palavra/Frase? [1 - Sim].: ");
            s = sc.nextInt();
            System.out.println("");
            if(s != 1){
                System.out.println("Aplicação encerrada...");
                System.out.println("");
                sim = false;
            }
        }
    }
    
}
