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
public class Calculator {
    //instance variable
    private int num1;
    private int num2;
    private int num3;
    
    //getters
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public int getNum3(){
        return this.num3;
    }
    
    //setters
    public void setNum1(int num1){
        this.num1=num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public void setNum3(int num3){
        this.num3=num3;
    }
    
    //process methods
    public void calcSum(){
        this.num3=this.num1+this.num2;
    }
    public void calcDif(){
        this.num3=this.num1-this.num2;
    }  
    public void calcPrd(){
        this.num3=this.num1*this.num2;
    }
    public void calcDiv(){
        this.num3=this.num1/this.num2;
    }
}
