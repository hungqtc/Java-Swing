/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.controller;

import DemoDB.view.MenuView;


/**
 *
 * @author DELL
 */
public class MenuController {

    private ProductController product_contrl;
    private MenuView mnview;

    public MenuController() {
    }

    public MenuController(ProductController product_contrl, MenuView mnview) {
        this.product_contrl = product_contrl;
        this.mnview = mnview;
    }

    public MenuController(ProductController product_contrl) {
        this.product_contrl = product_contrl;
    }

    public void choose_menu() {
        boolean flag = true;
        while (flag) {
            int result = mnview.show_menu();
            switch (result) {
                case 1:
                    product_contrl.inputProducts();
                    break;
                case 2:
                    product_contrl.showProducts();
                    break;
                case 3:
                    product_contrl.update();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
