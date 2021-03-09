/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeelogic.Product;
import lthdt.chuong3.coffeelogic.ProductCompByName;
import lthdt.chuong3.coffeelogic.ProductCompByPrice;

/**
 *
 * @author Fox0fNight
 */
public class testProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao mang
        Product[] pr = new Product[]{new Product("Sunsik", 100000),
            new Product("Cogac", 20000)};
        System.out.println(Arrays.toString(pr));

        Product temp;
//        for (int i = 0; i < pr.length-1; i++) {
//            for (int j = 0; j < pr.length; j++) {
//                if(pr[i].getPrice() > pr[j].getPrice()){
//                    temp = pr[i];
//                    pr[i] = pr[j];
//                    pr[j] = temp;
//                }
//            }
//        } 
        Arrays.sort(pr,new ProductCompByPrice());
        System.out.println(Arrays.toString(pr));
        Arrays.sort(pr,new ProductCompByName());
        System.out.println(Arrays.toString(pr));
    }

}
