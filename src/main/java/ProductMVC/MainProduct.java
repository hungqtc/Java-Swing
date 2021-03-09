/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductMVC;

import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class MainProduct {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        ProductController sc = new ProductController(new ProductView());
        int choose;
        Scanner scan = new Scanner(System.in);
        
        do{
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose){
                case 1:
                    sc.nhapdanhsachPro();break;
                case 2:
                    sc.hienthidanhsachPro();break;
                case 3:
                    sc.timkiemPro();break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: 
                    System.out.println("GOOBYE!!");break;
                default:
                    System.out.println("Nhap sai");break;
            }
        }while(choose!=4);
    
        
    }
    public static void showMenu(){
        System.out.println("1. Nhap vao so luong SV.");
        System.out.println("2. Hien thi danh sach SV.");
        System.out.println("3. Tim kiem SV theo SDT.");
        System.out.println("4. Sua SV.");
        System.out.println("5. Xoa SV.");
        System.out.println("6. Thoat.");
    }
    
}
