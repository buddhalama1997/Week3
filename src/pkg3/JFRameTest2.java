/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class JFRameTest2 {
    public static void main(String []args){
        JFrame frame=new JFrame();
        JLabel lbl_id=new JLabel();
        JTextField txt_id=new JTextField();
        JButton btn_close=new JButton();
        
        frame.setTitle("My Window");
        frame.setSize(250, 250);
        frame.setLayout(new FlowLayout());
        lbl_id.setText("Roll No : ");
        txt_id.setColumns(10);
        btn_close.setText("CLOSE");
        
        frame.add(lbl_id);
        frame.add(txt_id);
        frame.add(btn_close);
        frame.setVisible(true);
    }
}