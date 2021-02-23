/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg1.MyFunctions;

/**
 *
 * 
 * @author admin
 */

public class Test2 {
    public static void main(String []args){
        MyFunctions mf = new MyFunctions();
        mf.f1();//call method
        /*
        for(int i=1; i<=100; i++){
            mf.f1();//call method
        }
        
        int n1=40;
        mf.f2(n1);
        n1=45;
        mf.f2(n1);
        n1=10;
          mf.f2(n1);
    
     int n = mf.f3();
     System.out.println(n);
     mf.f2(n);

*/
        
        int a= mf.f4(12, 12);
        System.out.println(a);
    }
}



