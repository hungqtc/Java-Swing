/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB;

import DemoDB.controller.MenuController;
import DemoDB.controller.ProductController;
import DemoDB.view.MenuView;
import DemoDB.view.ProductView;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) {
        MenuController menu = new MenuController(new ProductController(new ProductView()), new MenuView());
        menu.choose_menu();
    }
}
