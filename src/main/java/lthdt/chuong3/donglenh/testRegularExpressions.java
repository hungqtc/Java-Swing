/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fox0fNight
 */
public class testRegularExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern pt = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        Matcher mc = pt.matcher("Java MVC swing");
        boolean found = mc.find();
        if(found){
            System.out.println("Tim thay");
        }else{
            System.out.println(" Khong tim thay");
        }
    }
    
}
