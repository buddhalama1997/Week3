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
public class CalculatorV2 {
    //instance varaible
    private int num1;
    private int num2;
    private int num3;//Calculated Value; i.e. num1 f num2
    
    //default constructor method - 
    public CalculatorV2(){
        this.num1=0;//default value
        this.num2=0;
        this.num3=0;
    }
    //parameterized constructor
    public CalculatorV2(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        this.num3=0;
    }
    
    public void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum1(){
        return this.num1;
    }
}   