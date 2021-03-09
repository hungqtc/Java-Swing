/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

/**
 *
 * @author Fox0fNight
 */
public class TestFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=100;
        double s=0;
        for(int i=1;i<=n;i++){
            s+=(double)1/i;
        }
        System.out.println("Tong thu nhat la: "+s);
        
        n=99;
        double s2=0;
        for(int i=1;i<=n;i+=2){
            s2+=i;
        }
        System.out.println("Tong thu hai la: "+s2);
    

        
    }
    
}
