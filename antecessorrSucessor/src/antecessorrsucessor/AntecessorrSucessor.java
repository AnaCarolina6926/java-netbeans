/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antecessorrsucessor;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class AntecessorrSucessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int antecessor, sucessor, um_numero;
        System.out.print("Digite o valor do um numero: ");
        um_numero = in.nextInt();
        in.nextLine();
        antecessor=um_numero-1;
        sucessor=um_numero+1;
        System.out.println("O valor do antecessor: " + antecessor);
        System.out.println("O valor do sucessor: " + sucessor);
    }
    
}
