/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_6;

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
        M56 obx1=new M56();
        String nom=obx1.setNom();
        double ventas=obx1.setprecio();
       if(ventas<=100)
        {
            System.out.println("El producto "+nom+" es de consumo bajo");
        }
        if(ventas>100)
        {
            if(ventas<=500)
            {
                System.out.println("El producto "+nom+" es de consumo medio");
            }    
        }
        if(ventas>500)
        {
            if(ventas<=1000)
            {
                System.out.println("El producto "+nom+" es de consumo alto");
            }    
        }
        if(ventas>1000)
        {
            System.out.println("El producto "+nom+" es de primera necesidad");    
        }
    }
    
}
