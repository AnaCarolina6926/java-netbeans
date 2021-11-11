/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtração;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Subtração {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Digite dois números: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a - b;
      System.out.println( "A subtração de " + a + " e " + b + " é: " + c );
    }
    
}
