/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMVC;

import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class MainSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kich_ban_3();
//        StudentController sc = new StudentController(new StudentView());
//        int choose;
//        Scanner scan = new Scanner(System.in);
//        
//        do{
//            showMenu();
//            System.out.println("Choose: ");
//            choose = Integer.parseInt(scan.nextLine());
//            switch (choose){
//                case 1:
//                    sc.nhapdanhsachSV();break;
//                case 2:
//                    sc.hienthidanhsachSV();break;
//                case 3:
////                    sc.timkiemsvtheosdt();break;
//                case 4: 
//                    System.out.println("GOOBYE!!");break;
//                default:
//                    System.out.println("Nhap sai");break;
//            }
//        }while(choose!=4);

    }

//    public static void showMenu() {
//        System.out.println("1. Nhap vao so luong SV.");
//        System.out.println("2. Hien thi danh sach SV.");
//        System.out.println("3. Tim kiem SV theo SDT.");
//        System.out.println("4. Thoat.");
//    }

    public static void kich_ban_1() {
        StudentController sc = new StudentController(new StudentView());
        sc.nhapdulieuSV();
        sc.hienthiSV();
    }

    public static void kich_ban_2() {
        StudentController sc = new StudentController(new StudentView());
        sc.nhapdanhsachSV();
        sc.hienthidanhsachSV();
//        sc.timkiemsvtheosdt();
        sc.tim_kiem_sv_theo_sdt();

    }
    
     public static void kich_ban_3(){
        MenuController menu = new MenuController(new StudentController(new StudentView()), 
                                new MenuView());
        menu.lua_chon_menu();
    }
}
