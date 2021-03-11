/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.model;

/**
 *
 * @author DELL
 */
public class Product {
    private int id;
    private String name;
    private int idCategory;
    private String categoryName;
    private String image;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", categoryName=" + categoryName + ", price=" + price + '}';
    }

    public Product(int id, String name, int idCategory, String categoryName, String image, int price) {
        this.id = id;
        this.name = name;
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.image = image;
        this.price = price;
    }

    public Product(int id, String name, String categoryName, String image, int price) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.image = image;
        this.price = price;
    }

    public Product() {
    }

    public Product(String name, int idCategory, String image, int price) {
        this.name = name;
        this.idCategory = idCategory;
        this.image = image;
        this.price = price;
    }

    public Product(int id, String name, int idCategory, String image, int price) {
        this.id = id;
        this.name = name;
        this.idCategory = idCategory;
        this.image = image;
        this.price = price;
    }
}
