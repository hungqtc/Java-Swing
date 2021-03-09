/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author Fox0fNight
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Le anh vu K17 CNTT";
        System.out.println(content);
        
        //tim vi tri tu
        System.out.println("Vi tri tu a: "+content.indexOf('a'));
        //kiem tra chu dau va cuoi
        System.out.println("Chu dau: "+content.startsWith("Le"));
        System.out.println("Chu cuoi: "+content.endsWith("Le"));
        //cat' chuoi
        System.out.println("Cat chuoi: "+content.substring(5, 10));
        //Phan tach chuoi
        String[] kq = content.split(" ");
        for (int i = 0; i < kq.length; i++) {
            System.out.println(kq[i]);
        }
        //cat khoang trang dau cuoi chuoi
        for (int i = 0; i < kq.length; i++) {
            System.out.println(kq[i].trim());
        }
        //Thay the ki tu   
        System.out.println("Thay the ky ty: "+content.replace('a', 'e'));
        //chuyen kieu chu
        System.out.println("Thay the ky ty: "+content.toUpperCase());
        System.out.println("Thay the ky ty: "+content.toLowerCase());
        //so sanh chuoi
        String temp="le";
        if(temp.compareTo("Le")==0){
            System.out.println("bang nhau");
        }else{
            System.out.println("ko bang nhau");
        }
        //noi chuoi
        System.out.println(temp.concat("lai"));
        //truy xuat chuoi
        for (int i = 0; i < content.length(); i++) {
            System.out.print(content.charAt(i));
        }
        System.out.println();
        //chuyen kieu dl
        temp ="111";
        int n=Integer.parseInt(temp);
        System.out.println("n= "+n);
        
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Le Anh Vu\n");
        sb.append("K17-CNTT");
        System.out.println(sb);
    }
    
}
