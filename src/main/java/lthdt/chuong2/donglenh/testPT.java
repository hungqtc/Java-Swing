/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import lthdt.chuong2.logic.PhuongTrinhBac2;

/**
 *
 * @author Fox0fNight
 */
public class testPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Giai pt bac 2:");
        PhuongTrinhBac2 p2 = new PhuongTrinhBac2(4, 5, 6);
        p2.giaiPT();
        System.out.println(p2.toString());
    }
    
}
