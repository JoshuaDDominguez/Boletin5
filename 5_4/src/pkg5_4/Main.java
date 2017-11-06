/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_4;

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
        String nom1="Maria";
        String nom2="Juan";
        M54 maria=new M54();
        M54 juan=new M54();
        Short pesoM=maria.pesoMaria();
        Short pesoJ=juan.pesoJuan();
        if(pesoM>pesoJ)
        {
            System.out.println("Peso de Maria "+pesoM+"Kg, "+(pesoM-pesoJ)+"Kg mas que Juan");
        }
        else
        {
            System.out.println("Juan pesa "+pesoJ+"Kg, "+(pesoJ-pesoM)+"Kg mas que Maria");
        }
    }
    
}
