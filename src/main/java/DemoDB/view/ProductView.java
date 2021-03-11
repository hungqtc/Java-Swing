/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.view;

import DemoDB.model.Category;
import DemoDB.model.Product;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ProductView {
        public void showProduct(Product product){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++ " + product.toString() + " ++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
    
    public Product inputProduct(ArrayList<Category> listCate){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(Category cate: listCate){
            System.out.println(cate.toString());
        }
        System.out.println("Choose Category: ");
        int idCate = Integer.parseInt(sc.nextLine());
        System.out.println("Price: ");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(name, idCate, null, price);
        System.out.println("Finished");
        System.out.println("++++++++++++++++++++++++++++++++++");
        return product;
    }
    
    public ArrayList<Product> inputProducts(ArrayList<Category> listCate){
        ArrayList<Product> result = new ArrayList<>();
        boolean flag = true;
        while(flag){
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)){
                flag = false;
            }else{
                Product product = inputProduct(listCate);
                result.add(product);
            }
        }
        return result;
    }
    
    public void showProducts(ArrayList<Product> products){
        
        System.out.println("++++++++++++++++++++++++++++++++++");
        for(Product product: products){
            System.out.println("++++ " + product.toString() + " ++++");
        }    
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
    
    
    
    //view nhap thong tin can tim
    public String nhap_sdt_can_tim(){
        System.out.println("+++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can tim kiem: ");
        String sdt = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return sdt;
    }
    
    public Product update(ArrayList<Category> listCate){
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        System.out.println("ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        for(Category cate: listCate){
            System.out.println(cate.toString());
        }
        System.out.println("Choose Category: ");
        int idCate = Integer.parseInt(sc.nextLine());
        System.out.println("Price: ");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, idCate, null, price);
        System.out.println("Finished");
        System.out.println("++++++++++++++++++++++++++++++++++");
        return product;
    }
    
    //view in ket qua tim kiem
//    public void ket_qua_tim_kiem_sdt(ArrayList<Student> students){
//        System.out.println("+++++++++++++++++++++++");
//        if (students.isEmpty()){
//            System.out.println("Khong tim thay");
//        }else{
//            for(Student sv: students){
//                System.out.println(sv.toString());
//            }
//        }
//        System.out.println("+++++++++++++++++++++++");
//    }
}
