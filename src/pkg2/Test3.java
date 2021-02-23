/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg1.CalculatorV2;
/**
 *
 * @author admin
 */
public class Test3 {
    public static void main(String []args){
        CalculatorV2 c1, c2,c3;
        c1 = new CalculatorV2();//
        c2 = new CalculatorV2(5, 40);//
        c3 = new CalculatorV2(10, 4);//
        
        System.out.println(c1.getNum1());
        System.out.println(c2.getNum1());
        System.out.println(c3.getNum1());
    }
}
