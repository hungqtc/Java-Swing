/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong2.employeelogic.Student;

/**
 *
 * @author Fox0fNight
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        String input = "11-01-1991";
        Date ngaysinh = df.parse(input);
        Student st = new Student("DHH", "gioi", "Le va a", 1, ngaysinh);
        switch (st.getHocluc()){
            case "Xuat sac":
                st.setHocbong(1000);break;
            case "gioi":
                st.setHocbong(700);break;
            default:
                st.setHocbong(0);break;
        }
                
        System.out.println(st);
    }
    
}
