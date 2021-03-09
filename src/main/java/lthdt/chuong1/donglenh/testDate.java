/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Fox0fNight
 */
public class testDate {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        Date currentDate = new Date();
        String output = sd.format(currentDate);
        System.out.println(output);
        
        String input = "15-09-1994";
        Date sn = sd.parse(input);
        System.out.println(sn);
        System.out.println(sd.format(sn));
    }
}
