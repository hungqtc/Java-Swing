/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong3.coffeelogic.CoffeeShop;
import lthdt.chuong3.coffeelogic.Manager;

/**
 *
 * @author Fox0fNight
 */
public class testCoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("HighLand", "Le Loi"),
                                          new CoffeeShop("GongCha", "Nguyen Hue")};
        Manager[] ma = new Manager[]{new Manager(a, 1000, "Le A", 0, df.parse("12-12-1999")),
                                        new Manager(new CoffeeShop[]{
                                            new CoffeeShop("hahah", "husudsdu")
                                        },2000,"Nguyen B",1,df.parse("01-01-1991"))};
        
        System.out.println(Arrays.toString(ma));
    }
    
}
