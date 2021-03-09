/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.coffeelogic;

/**
 *
 * @author Fox0fNight
 */
public class CoffeeShop {
    private String name;
    private String diachi;

    public CoffeeShop() {
    }

    public CoffeeShop(String name, String diachi) {
        this.name = name;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "name=" + name + ", diachi=" + diachi + '}';
    }
    
}
