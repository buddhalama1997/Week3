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
import pkg1.C2;
public class TestClassVariable {
    public static void main(String []args){
        
        C2 obj1 = new C2();
        C2 obj2 = new C2();
        obj1.collegeName="PCPS";
        System.out.println(obj2.collegeName);
        
        C2.collegeName = "Patan College for Professional Stududies";
        System.out.println(C2.collegeName);
        System.out.println(obj2.collegeName);
        System.out.println(obj1.collegeName);
    }
}
