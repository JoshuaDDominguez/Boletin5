/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_5;

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
        M55 obx1=new M55();
        int num1=obx1.setNum();
        int num2=obx1.setNum();
        int num3=obx1.setNum();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("O maior e "+num1);
            }    
        }
        if(num2>num1)
        {
            if(num2>num3)
            {
                System.out.println("O maior e "+num2);
            }    
        }
        if(num3>num1)
        {
            if(num3>num2)
            {
                System.out.println("O maior e "+num3);
            }    
        }
        else
        {
            System.out.println("Todos os numeros son iguais");    
        }
    }
    
}
