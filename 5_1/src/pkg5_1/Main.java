/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_1;


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
        
        M51 num1 =new M51();
        int n=num1.setNumero();
        if(n>=0)
        {
            System.out.println(n+" e positivo");   
        }
    }
    
}
