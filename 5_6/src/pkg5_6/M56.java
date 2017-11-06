/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_6;
import java.util.Scanner;
/**
 *
 * @author jdominguezdominguez
 */
public class M56 {
   Scanner sc=new Scanner(System.in);
   public String setNom(){
       System.out.println("Introduzca el nombre del producto");
       String nom=sc.nextLine();
       return nom;
   }
   public double setprecio(){
       System.out.println("Introduzca las ventas anuales del producto");
       double ventas=sc.nextDouble();
       return ventas;
   }
}
