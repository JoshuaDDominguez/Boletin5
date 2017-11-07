/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_7;
import java.util.Scanner;
/**
 *
 * @author jdominguezdominguez
 */
public class M57 {
    
    public void calcular (int op){
        Scanner sc=new Scanner(System.in);
        switch(op){
            case 1: 
                System.out.println("Introduzca el valor del lado");
                int lado=sc.nextInt();
                System.out.println("Area del cuadrado "+lado*lado);
                break;
            case 2:
                System.out.println("Introduzca el valor de la base");
                int base=sc.nextInt();
                System.out.println("Introduzca el valor de la altura");
                int altura=sc.nextInt();
                System.out.println("Area del triangulo "+base*altura/2);
                break;
            case 3:
                System.out.println("Introduzca el valor del radio");
                int radio=sc.nextInt();
                System.out.println("Area del circulo "+Math.PI*(radio*radio));
                break;
        }
    }
}
