/**
 * REFERENTE AOS EXERCÍCIOS DE NÚM 4 E 5 DA LISTA 1.
 */
package exercicio4_lista1_2021;

import java.util.Scanner;

/**
 *
 * @author Paulo Glanzel
 */
public class Exercicio4_lista1_2021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Lendo palavra e atribuindo os caracteres a um vetor --");
        System.out.println("");
        System.out.print("Digite uma palavra/nome.: ");
        String palavra = sc.next();
        String s = "";
        String[] arrayPalavra = new String[palavra.length()];
        for(int i =0; i<palavra.length(); i++){
            arrayPalavra[i] = Character.toString(palavra.charAt(i));
        }
        System.out.println("");
        System.out.println("Verificando Resultado:");
        System.out.println("");
        for(int i = 0; i< arrayPalavra.length; i++){
            System.out.println("Array na posição "+i+" é igual a.: "+arrayPalavra[i]);
        }
        

// EXERCÍCIO 5
        System.out.println("");
        System.out.println("Concatenando novamente os valores");
        System.out.println("");
        for(int i = 0; i< arrayPalavra.length; i++){
            s = s + arrayPalavra[i];
        }
        System.out.println("Palavra concatenada.: "+s);
        System.out.println("");
    }    
}
