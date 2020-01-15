/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amplitude;

import java.util.Scanner;

/*
 * @author M@D
 */
public class TableauAmplitude {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // CONSTANTE
        final int a = 5;
        final int b = 2;
        
        // VARIABLES
        int[][] Te = new int[a][b];
        int i, j, m, n;
        
        // INSTRUCTIONS
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print("Entrez un nombre: ");
                Te[i][j] = reader.nextInt();
            }
        }
        
        m = 0;
        n = 0;
        for (i = 0; i < a; i++) {
            System.out.println();
            for (j = 0; j < b; j++) {
                System.out.print(Te[i][j] + "\t");
                if (Te[i][j] < n) {
                   n = Te[i][j];
                } else if (Te[i][j] > m) {
                    m = Te[i][j];
                }
            }
        }
        
        int o = m - n;
        System.out.println("\n L'amplitude des éléments est égale à: " + o);
    }
    
}
