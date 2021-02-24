/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import pkg1.BasicIO;
import pkg1.Calculator;

/**
 *
 * @author admin
 */
public class TestIO2 {
    public static void main(String []args){
        String num1, num2;
        BasicIO io=new BasicIO();
        Calculator c2 =new Calculator();
        int n1, n2, n3;
        
        //input
        io.print("Enter first No : ");
        num1 = io.readString();
        io.print("Enter second No : ");
        num2 = io.readString();
        
        //Type Conversion
        //String to Intege
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        
        c2.setNum1(n1);
        c2.setNum2(n2);
        c2.calcSum();
        
        //output
        io.print("Num1 "+num1);
        io.print("Num2 "+num2);
        io.print("SUM "+c2.getNum3());
        
    }
}
