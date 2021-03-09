/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class TestWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;
        
//        double s1 = 0;
//        n=100;i=1;
//        while(i<=100){
//            s1+=1/i;i++;
//        }
//        System.out.println("Tong thu nhat la: "+s1 );
        
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println("Nhap so nguyen duong le n = ");
            String input = sc.nextLine(); n=Integer.parseInt(input);
            flag = ((n>0)&&(n%2!=0))?true:false;
        }
        
        int s2=0;
        n=99;i=1;
        while(i<=n){
            s2+=i;i=i+2;
        }
        System.out.println("Tong thu hai la "+s2);
    }
    
}
