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
public class PhuongTrinhBac2 implements PhuongTrinhInterface{
    private double a,b,c,nghiem_x1,nghiem_x2;
    private String result;

    public PhuongTrinhBac2() {
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    @Override
    public void giaiPT() {
        if(a==0){
            PhuongTrinhBac1 p1 = new PhuongTrinhBac1(b, c);
            p1.giaiPT();
            result = p1.getResult();
        }else{
            double delta = b*b-4*a*c;
            if(delta<0){
                result = "PTVN";
            }else{
                if(delta == 0){
                    nghiem_x1 = -b/(2*a);
                    result = "PT co 1 nghiem kep: "+nghiem_x1;
                }else{
                    nghiem_x1= (-b+Math.sqrt(delta))/(2*a);
                    nghiem_x2= (-b-Math.sqrt(delta))/(2*a);
                    result = "Phuong trinh co 2 nghiem x1 = "+nghiem_x1+"; x2= "+nghiem_x2;
                }
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
