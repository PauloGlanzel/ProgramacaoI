
package qualnumerosorteado;

import java.util.Scanner;

/**
 * @author Paulo Glanzel
 */
public class QualNumeroSorteado {
    static boolean sim = true;
    static boolean errou;
    static int chute;
    static int numero;
    static int conta;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(sim){
            errou = true;
            conta = 0;
            numero = sorteioNumero();
            System.out.print("Número sorteado - de o seu CHUTE");
            while(errou){
                contaTentativa(conta);
                System.out.print("\n Digite um número entre 0 e 10.: ");
                chute = sc.nextInt();
                errou = comparaNumero(numero, chute);     
            }
            sim = continua();
        }
    }

    public static int sorteioNumero(){
       return  (int) (Math.random()*10);
    }
    
    public static boolean continua(){
        System.out.print("\n\nDeseja Brincar novamnte? [1 - Sim].: ");
        int s = sc.nextInt();
        if(s != 1){
            System.out.print("\nAplicação encerrada...");
            return false;
        }else {
            return true;
        }
    }
    
    public static boolean comparaNumero(int n, int c){
        if(n < c){
            System.out.print("\n Chute alto...");
            return true;       
        }else if(n > c){
            System.out.print("\n Chute baixo...");
            return true;               
        }else{
            System.out.print("\n Você acertou...");
            System.out.print("\n Em "+conta+" Tentativa(s).");
            return false;
        }    
    }
    
    public static void contaTentativa(int x){
        conta += 1;
    }    
}
