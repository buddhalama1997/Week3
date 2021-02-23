/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg1.Calculator;

/**
 *
 * @author admin
 */
public class Test1 {
    public static void main(String []args){
        int num1, num2;
        int res1, res2, res3, res4;
        Calculator c1 = new Calculator();
        
        num1=25;
        num2=4;
        c1.setNum1(num1);//set
        c1.setNum2(num2);//set
        
        c1.calcSum();//process
        res1 = c1.getNum3();//get
        c1.calcDif();
        res2 = c1.getNum3();
        c1.calcPrd();
        res3 = c1.getNum3();
        c1.calcDiv();
        res4 = c1.getNum3();
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        //test calcDif, calcPrd, calcDiv
        
    }
}