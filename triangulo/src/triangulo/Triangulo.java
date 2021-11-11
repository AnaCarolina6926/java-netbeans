/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c ,Area,semip,perimetro ;

Scanner entrada=new Scanner(System.in);

System.out.println("Digite o valor de a");
a=entrada.nextDouble();
System.out.println("Digite o valor de b");
b=entrada.nextDouble();
System.out.println("Digite o valor de c");
c=entrada.nextDouble();
if( (a<b+c)||(b<a+c)||(c<b+a)){ /*CONDIÇÃO PARA PODER CALCULAR ÁREA DO TRIÂNGULO */

perimetro=a+b+c;

semip=perimetro/2;
Area=Math.sqrt(semip*(a + b + c));
System.out.println("Perimetro= " + perimetro);
System.out.println("Area= " + Area);
}
else{
System.out.println("As medidas não obedecem a condição existência do triângulo");
}

}
}
