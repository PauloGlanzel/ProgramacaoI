package exercicio3_lista1_2021;

/**
 *
 * @author Paulo Glanzel
 */
public class Exercicio3_lista1_2021 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int somaPares = 0;
        String par = "";
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 100 ) + 1;        
        }
        System.out.println("Numeros do array listados em ordem de atribuição.");
        System.out.println("");
        for(int i = 0; i <numeros.length; i++){
            if(numeros[i] % 2 == 0){
                somaPares ++;
                par = "É par";
            }else{
                par = "";
            }
            System.out.println("Posição: "+i+" Valor.: "+numeros[i]+" "+par);
        }
        System.out.println("");
        System.out.println("Total de numeros pares é.: "+somaPares);
    }    
}
