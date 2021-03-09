/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.employeelogic;

import java.util.Date;

/**
 *
 * @author Fox0fNight
 */
public class Student extends Person implements TaxInterface{
    private String truonghoc;
    private String hocluc;
    private double hocbong;

    public Student() {
    }

    public Student(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    public Student(String truonghoc, String hocluc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
    }

    public Student(String truonghoc, String hocluc, double hocbong, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
        this.hocbong = hocbong;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }
    
    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "Student{" + "truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
        return ketqua;
    }

    
 
}
