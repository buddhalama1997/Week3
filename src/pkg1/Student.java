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
public class Student {
//instance variables
    int rollNo;   
    String fullName;
    String grade;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    
    int total;
    int average;
    String result;
    //default constructor
    public Student(){
        this.rollNo=0;
        this.fullName="";
        this.grade="";
        this.sub1=0;
        this.sub2=0;
        this.sub3=0;
        this.sub4=0;
        this.total=0;
        this.average=0;
        this.result="";
    }
    public Student(int rollNo, String fullName, String grade, int sub1, int sub2, int sub3, int sub4){
        this.rollNo=rollNo;
        this.fullName=fullName;
        this.grade=grade;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        //
        this.total=0;
        this.average=0;
        this.result="";
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public int getSub4() {
        return sub4;
    }

    public void setSub4(int sub4) {
        this.sub4 = sub4;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public void calcTotal(){
        this.total=this.getSub1()+this.getSub2()+this.getSub3()+this.getSub4();
        }

    public void calcAverage(){
       this.average=this.getTotal()/4;
    }
    
    public void calcResult(){
        int PM =40;
        if((this.sub1>=PM) && (this.sub2>=PM) && 
                (this.sub3>=PM) && (this.sub4>=PM)){
            this.result="PASS";
        }
        else{
            this.result="FAIL";
        }
    }
}
