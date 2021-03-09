/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.logic;

/**
 *
 * @author Fox0fNight
 */
public class PhuongTrinhBac1 implements PhuongTrinhInterface{
    private double a,b,nghiem_x;
    private String result;

    public PhuongTrinhBac1() {
    }

    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
        
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    @Override
    public void giaiPT() {
        if (a!=0){
            nghiem_x = -b/a;
            result = "PT co 1 nghiem: "+nghiem_x;
        }else{
            if(b!=0){
                result = "PTVSN";
            }else{
                result = "PTVN";
            }
        }
    }

    @Override
    public String toString() {
        if(result == null || result.isEmpty()){
            giaiPT();
        }
        return result;
    }
    
}
