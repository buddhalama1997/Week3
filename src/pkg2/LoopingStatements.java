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
public class LoopingStatements {
    public static void main(String []args){
        //while loop
        int start=1, end=10;
        while(start<=end){
            System.out.println("Hello");
            start++;
        }
        
        //do while loop
        start=1;
        end=5;
        do{
            System.out.println("Hello");
            start++;
        }while(start<=end);
        
        //for loop
        for(int i=1; i<=end; i++){
            System.out.println("Hello");
        }
        System.out.println("----------------------------");
        //break statement
        for(int i=1; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println("Hello");
        }
    }
}