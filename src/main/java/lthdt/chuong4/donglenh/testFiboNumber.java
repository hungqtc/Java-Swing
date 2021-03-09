/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong4.donglenh;

import lthdt.chuong4.logic.FibonacciNumber;

/**
 *
 * @author Fox0fNight
 */
public class testFiboNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciNumber fb = new FibonacciNumber();
        System.out.println("So fibo cua n=15 la: "+fb.calcFibo(15));
        
        for(int i=0;i<=20;i++){
            System.out.println("  "+fb.calcFibo(i));
        }
    }
    
}
