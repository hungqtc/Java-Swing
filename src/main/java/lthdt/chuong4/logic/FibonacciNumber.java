/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong4.logic;

/**
 *
 * @author Fox0fNight
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    
    public int calcFibo(int n){
        //dk dung
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        //lap
        return (calcFibo(n-1)+calcFibo(n-2));
    }
}
