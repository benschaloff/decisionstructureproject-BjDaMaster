/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author fornebra
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.println("How old are you?");
        int age = scan.nextInt();
        
        if (age>=16){
            out.println("You are old enough to drive");
        }else {
            out.println("You are not old enough to drive");
        }
        
        if (age>=18){
            out.println("You are old enough to vote");
        }else {
            out.println("You are not old enough to vote");
        }
        
        if (age>=21){
            out.println("You are old enough to drink alcohol");
        }else {
            out.println("You are not old enough to drink alcohol");
        }
    }
    
}
