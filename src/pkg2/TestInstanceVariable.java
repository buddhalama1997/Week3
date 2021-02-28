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
import pkg1.C1;
public class TestInstanceVariable {
    public static void main(String []args){
        C1 obj1 = new C1();
        C1 obj2 = new C1();
        
        obj1.x=2;
        obj1.y=8;
        
        obj2.x=7;
        obj2.y=6;
        
        System.out.println(obj1.x+", "+obj1.y);
        System.out.println(obj2.x+", "+obj2.y);
        
    }
}
