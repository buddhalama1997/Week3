/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import pkg1.BasicIO;

/**
 *
 * @author admin
 */
public class Test4 {
    public static void main(String []args){
        BasicIO io = new BasicIO();
        for(;;){
            io.printString("Enter your choice (Y - Exit) : ");
            char ch = io.readChar();
            if (ch=='Y' || ch=='y'){
                System.exit(0);
            }
        }
    }
}    
