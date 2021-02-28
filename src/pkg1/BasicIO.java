/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
//basic input and output
public class BasicIO {
    public void print(String msg){
        System.out.println(msg);
    }
    
    public String readString(){
        //read string from keyboard
        return new Scanner(System.in).nextLine();
    }
    public char readChar(){
        return readString().charAt(0);
    }
    public int readInteger(){
        return Integer.parseInt(readString());
    }
    public void printString(String message){
        System.out.print(message);
    }
    public void newLine(){
        System.out.println();
    }
}
