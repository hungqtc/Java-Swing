/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.view;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MenuView {
     public MenuView() {
    }
    
    public int show_menu(){
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi danh sach san pham ");
        System.out.println("3. Chinh sua san pham ");
        System.out.println("4. Thoat chung trinh");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Ban chon chuc nang nao?");
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        return result;
    }
}
