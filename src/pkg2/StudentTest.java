/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg1.Student;
/**
 *
 * @author admin
 */
public class StudentTest {
    public static void main(String []args){
        Student s1 = new Student();
        Student s2 = new Student(1, "Raj","BSCIT",10,45,32,56);
        s2.setFullName("Raj Sharma");
        s1.setRollNo(2);
        s1.setFullName("P");
        //input from keyboard (all values)
        //set on object
        //calculate (total, average, result)
        //print results
        System.out.println(s2.getFullName());
        
    }
}
