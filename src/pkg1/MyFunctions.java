/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author admin
 */
public class MyFunctions {
//No return type; no parameter
    public void f1(){
        System.out.println("Hello from f1");
    }
    
//no return type; parameter
    public void f2(int num1){
        System.out.println("Num1 = "+num1);
    }
    
//return type; no paramter
    public int f3(){
        return 30;
    }

//return type; paramter(s)
    public int f4(int num1, int num2){
        return num1+num2;
    }
    
    public void displayMainMenu(){
        System.out.println("Main Menu ------------------");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. PRD");
        System.out.println("4. DIV");
        System.out.println("---------------------------------");
    }
    
}
