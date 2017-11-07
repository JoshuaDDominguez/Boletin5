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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        M57 obx1=new M57();
        System.out.println("*** Menu***\n1...Cuadrado\n2...Triangulo\n3...Circulo");
        int op=sc.nextInt();
        obx1.calcular(op);
        
        
    }
    
}
