/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.controller;

import DemoDB.dao.CategoryDAO;
import DemoDB.dao.ProductDAO;
import DemoDB.model.Product;
import DemoDB.view.ProductView;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ProductController {
    private ArrayList<Product> products;
    private ProductView view;
    ProductDAO productDAO = new ProductDAO();
    CategoryDAO categoryDAO = new CategoryDAO();
    
    public ProductController(ArrayList<Product> products, ProductView view) {
        this.products = products;
        this.view = view;
    }

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductController(ProductView view) {
        this.view = view;
    }
    
    public void showProducts(){
        this.products = productDAO.findAll();
        this.view.showProducts(this.products);
    }
    
     public void inputProduct(){
        Product product = this.view.inputProduct(categoryDAO.findAll());
        productDAO.save(product);
    }
    
    public void inputProducts(){
        this.products = this.view.inputProducts(categoryDAO.findAll());
        for(Product product: products){
            productDAO.save(product);
        }
    }
     public void update(){
        Product product = this.view.update(categoryDAO.findAll());
        productDAO.update(product);
    }
}
