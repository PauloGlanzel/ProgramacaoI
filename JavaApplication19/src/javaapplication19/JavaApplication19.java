/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Paulo Glanzel
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] m = new int[3][6];
        int x = 10;
        for(int i =0; i<3; i++){
            for(int j = 0; j< 6; j++){
                m[i][j] = (i+j)*x;
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
