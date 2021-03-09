/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMVC;

/**
 *
 * @author Fox0fNight
 */
public class Student {
    private String fullname, phone;
    private double age;

    public Student() {
    }

    public Student(String fullname, String phone, double age) {
        this.fullname = fullname;
        this.phone = phone;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ho ten SV: "+fullname+"; SDT: "+phone+"; Tuoi: "+age;
    }
    
    
}
