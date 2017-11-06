/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_2;

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
        M52 num1= new M52();
        M52 num2= new M52();
        short a=num1.setNum1();
        short b=num2.setNum2();
        if (a>=b)
        {
            System.out.println(a-b);
        }
        else
        {
            System.out.println(a+b);    
        }
        
    }
    
}
