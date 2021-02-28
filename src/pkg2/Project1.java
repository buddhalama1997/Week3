/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author admin
 */
import pkg1.BasicIO;
import pkg1.MyFunctions;
import pkg1.Calculator;

public class Project1 {
    public static void main(String []args){
        int choice;
        int num1, num2, num3;
        Calculator c1 = new Calculator();
        
        for(;;){
            BasicIO io = new BasicIO();
            MyFunctions obj1 = new MyFunctions();
            obj1.displayMainMenu();
            io.printString("Enter your choice (0-> Exit) : ");
            choice = io.readInteger();
            io.printString("--------------------------------");
            io.newLine();
            
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    //add
                    io.printString("Enter first no : ");
                    num1 = io.readInteger();
                    io.printString("Enter second no : ");
                    num2 = io.readInteger();
                    c1.setNum1(num1);
                    c1.setNum2(num2);
                    c1.calcSum();
                    io.printString("Result : "+c1.getNum3());
                    io.newLine();
                    break;
                case 2:
                    //sub
                     io.printString("SUB");
                    break;
                case 3:
                    //prd
                     io.printString("PRD");
                    break;
                case 4:
                    //div
                     io.printString("DIV");
                    break;
                default:
                    io.printString("Choice out of range");
                    io.newLine();
            }
        }
        
    }
}








