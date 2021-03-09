/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import lthdt.chuong3.coffeelogic.Bill;
import lthdt.chuong3.coffeelogic.Product;

/**
 *
 * @author Fox0fNight
 */
public class testBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Bill a = new Bill(12,new Product[]{new Product("clean",1500),new Product("Closeup", 500)});
        System.out.println("a = "+a);
        
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        
        System.out.println("a = "+a);
        System.out.println("temp = "+temp);
    }
    
}
