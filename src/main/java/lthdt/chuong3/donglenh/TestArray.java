/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang:");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            input = sc.nextLine();a[i]=Integer.parseInt(input);
        }
//        System.out.println("Mang vua nhap la:");System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
