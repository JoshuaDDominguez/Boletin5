/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_4;
import java.util.Scanner;
/**
 *
 * @author jdominguezdominguez
 */
public class M54 {
    Scanner sc= new Scanner(System.in);
    public Short pesoMaria(){
        System.out.println("Introduzca peso de Maria");
        Short pesoM=sc.nextShort();
        return pesoM;
    }
    public Short pesoJuan(){
        System.out.println("Introduzca peso de Juan");
        Short pesoJ=sc.nextShort();
        return pesoJ;
    }
}
