/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;

import lthdt.chuong2.employeelogic.Person;
import lthdt.chuong2.employeelogic.Student;
import java.rmi.registry.LocateRegistry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Fox0fNight
 */
public class testExtends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        String input = "11-01-1991";
        Date ngaysinh = df.parse(input);
        Person pe = new Person("Nguyen van a", 30, ngaysinh);
        System.out.println("Ho ten: "+pe.getHoten()+"; gioi tinh: "+ pe.getGioitinh()+"; ngay sinh: "+df.format(pe.getNgaysinh()));
        
        Student st = new Student();
        st.setHoten("Nguyen van a");
        st.setGioitinh(1);
        st.setNgaysinh(df.parse("11-02-1999"));
        st.setTruonghoc("Dai hoc PXU");
        System.out.println("Ho ten sv: "+st.getHoten()+"; Gioi tinh: "+st.getGioitinh()+"; Ngay sinh: "+df.format(st.getNgaysinh())+"; "+st.getTruonghoc());
        System.out.println(st.calcTax(1000));
    }
    
}
