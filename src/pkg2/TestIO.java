/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg1.BasicIO;
/**
 *
 * @author admin
 */
public class TestIO {
    public static void main(String []args){
        String id, name, address;
        BasicIO io = new BasicIO();
        io.print("Enter id : ");
        id = io.readString();
        io.print("Enter name : ");
        name = io.readString();
        io.print("Enter address : ");
        address = io.readString();
        //output
        io.print("------------------------------------");
        io.print("ID "+id);
        io.print("NAME "+name);
        io.print("ADDRESS "+address);
        io.print("------------------------------------");
        
    }
}
