/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductMVC;

import java.util.ArrayList;

/**
 *
 * @author Fox0fNight
 */
public class ProductController {
     private Product pro;
    private ArrayList<Product> pros;
    private ProductView proview;
    public ProductController() {
    }

    public ProductController(Product pro) {
        this.pro = pro;
    }
    
    public ProductController(Product pro, ArrayList<Product> pros, ProductView proview) {
        this.pro = pro;
        this.pros = pros;
        this.proview = proview;
    }

    public ProductController(ProductView proview) {
        this.proview = proview;
    }

    public ProductController(Product pro, ProductView proview) {
        this.pro = pro;
        this.proview = proview;
    }
     
    public void nhapdulieuPro(){
        this.pro = this.proview.themPro();
    }
    public void nhapdanhsachPro(){
        this.pros = this.proview.nhapdanhsachPro();
    }
    public void hienthiPro(){
        this.proview.hienthiPro(this.pro);
    }
    public void hienthidanhsachPro(){
        this.proview.hienthidanhsachPro(pros);
    }
    public void timkiemPro(){
        this.proview.timPro(pros);
    }
    public void xoaPro(){
        this.proview.deletePro();
    }
}
