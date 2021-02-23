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
public class StringTest {
    public static void main(String []args){
        String str1="Patan College for Professional Studies";
        //char charAt(int index)
        //int length()
        
        
        int len = str1.length();
        char ch = str1.charAt(0);
        
        System.out.println(len);
        System.out.println(ch);
        
        //int compareTo​(String anotherString)
        String str2 ="ktm";
        String str3 ="ktm";
        int res1 = str2.compareTo(str3);
        if (res1==0){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        
        
    }    
}
