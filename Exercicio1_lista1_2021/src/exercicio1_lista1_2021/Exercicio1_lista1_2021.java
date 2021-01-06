package exercicio1_lista1_2021;

/**
 *
 * @author Paulo Glanzel
 */
public class Exercicio1_lista1_2021 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 10 ) + 1;        
        }
        System.out.println("Numeros do array listados em ordem de atribuição.");
        System.out.println("");
        for(int i = 0; i <numeros.length; i++){
            System.out.println("Posição: "+i+" Valor.: "+numeros[i]);
        }
        System.out.println("");
        System.out.println("Numeros do array listados em ordem inversa.");
        for(int i = numeros.length-1; i >= 0; i--){
            System.out.println("Posição: "+i+" Valor.: "+numeros[i]);
        }
    }    
}
