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
public class Bill implements Cloneable{
    private int billID;
    private Product[] prs;

    public Bill() {
    }

    public Bill(int billID, Product[] prs) {
        this.billID = billID;
        this.prs = prs;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Product[] getPrs() {
        return prs;
    }

    public void setPrs(Product[] prs) {
        this.prs = prs;
    }

    @Override
    public String toString() {
        String ketqua = "Bill "+this.billID+"\n";
        for(int i=0; i<prs.length;i++){
            ketqua += "\t"+prs[i].toString()+"\n";
        }
        return ketqua;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
            Bill temp = (Bill) super.clone();
            temp.setBillID(this.billID);
            temp.prs = new Product[this.prs.length];
             for (int i = 0; i < this.prs.length; i++) {
            temp.prs[i] =  new Product(this.prs[i].getName(), this.prs[i].getPrice());
        }
             
             return temp;
        }
    
    
}
