
package tarefavetores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Paulo Glanzel
 */
public class TarefaVetores {

    public static void main(String[] args) throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(in));
        System.out.println("**********  Tarefa Vetores   **********");
        System.out.println("Ler palavra ou frase, armazenar em um vetor e");
        System.out.println("verificar se corresponde a um PALINDROMO.");
        System.out.println();
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
        
        System.out.println(semEspaco);
        String semEspacoInvertido = "";
        for(int i = arraySemEspaco.length -1 ; i >= 0; i--){
            semEspacoInvertido += arraySemEspaco[i];
        }
        System.out.println(semEspacoInvertido);
        if(semEspaco.equals(semEspacoInvertido)){
            System.out.println("É Palíndromo");
        }else{
            System.out.println("Não é Palíndromo");
        }
    }
    
}
