/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMVC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class StudentView {
    String fullname, phone;
    double age;
    public StudentView() {
    }
    public void hienthiSV(Student x){
        System.out.println("---------------------");
        System.out.println("++"+x.toString()+"++");                
        System.out.println("---------------------");
    }
    public Student themSV(){
        System.out.println("----------------------");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        fullname = sc.nextLine();
        System.out.println("Phone: ");
        phone = sc.nextLine();
        System.out.println("Age: ");
        age = Double.parseDouble(sc.nextLine());
        Student sv =new Student(fullname,phone,age);
                System.out.println("Finish");
                        System.out.println("**********************************");
        return sv;
    }
    
    //Array
    public ArrayList<Student> nhapdanhsachSV(){
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        while (flag){
            System.out.println("Ban muon nhap du lieu khong?(Y/N)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if("n".equals(answer)||"N".equals(answer)){
                flag = false;
            }else{
                Student st =  themSV();
                list.add(st);
            }
        }
        return list;
    }
    
    public void hienthidanhsachSV(ArrayList<Student> students){
        System.out.println("---------------------");
        for(Student st:students){
                    System.out.println("++"+st.toString()+"++");                
        }
        System.out.println("---------------------");
    }
    //tim kiem sv theo so dien thoai
    
//    public void timSV(ArrayList<Student> students ){
//        int result = -1;
//        ArrayList<Student> list = new ArrayList<>();
//        System.out.println("Nhap sdt SV can tim: ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        
//        for(Student st:students){
//            if(st.getPhone().equalsIgnoreCase(input)){
//                hienthiSV(st);
//                result++;
//            }
//        }
//        if (result == -1){
//            System.out.println("Khong tim thay SV");
//        }  
//    }
    
    //view nhap thong tin can tim
    public String nhap_sdt_can_tim(){
        System.out.println("+++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can tim kiem: ");
        String sdt = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return sdt;
    }
    
    //view in ket qua tim kiem
    public void ket_qua_tim_kiem_sdt(ArrayList<Student> students){
        System.out.println("+++++++++++++++++++++++");
        if (students.isEmpty()){
            System.out.println("Khong tim thay");
        }else{
            for(Student sv: students){
                System.out.println(sv.toString());
            }
        }
        System.out.println("+++++++++++++++++++++++");
    }
}
