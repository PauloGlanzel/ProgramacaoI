package exercicio2_lista1_2021;

/**
 *
 * @author Paulo Glanzel
 */
public class Exercicio2_lista1_2021 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 100 ) + 1;        
        }
        System.out.println("Numeros do array listados em ordem de atribuição.");
        System.out.println("");
        for(int i = 0; i <numeros.length; i++){
            System.out.println("Posição: "+i+" Valor.: "+numeros[i]);
            soma += numeros[i];
        }
        System.out.println("");
        System.out.println("Soma de todos os valores do array.: "+soma);
    }
    
}