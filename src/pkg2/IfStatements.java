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
public class IfStatements {
    public static void main(String []args){
        
//if statement
        if(true){
            System.out.println("Hello1");
        }
        if(false){
            System.out.println("Hello2");
        }
    //
        char ch='Z';
        if(ch =='A'){
            System.out.println("First character");
        }
        
        int n = 0;
        if(n == 0){
            System.out.println("zero");
        }
        if(n == 1){
            System.out.println("one");
        }
        if(n == 2){
            System.out.println("two");
        }
        if(!false){
            System.out.println("hello");
        }
        
        if(n == 1){
            System.out.println("one");
        }
        else{
            System.out.println("other");
        }
        
        n=3;
        if(n==0){
            System.out.println("zero");
        }
        else if(n==1){
            System.out.println("one");
        }
        else{
            System.out.println("others");
        }
        
//switch statement
        n = 2;
        switch(n){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
        }
    }
}
