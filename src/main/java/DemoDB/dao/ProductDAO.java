/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.dao;

import DemoDB.model.Product;
import DemoDB.utils.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ProductDAO {
    private Connection conn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private final String FINDALL_SQL = "SELECT p.*, c.name AS categoryName FROM products AS p INNER JOIN categories AS c ON p.category_id = c.id";
    private final String FINDBYID_SQL = "SELECT p.*, c.name AS categoryName FROM products AS p INNER JOIN categories AS c ON p.category_id = c.id WHERE p.id = ?";
    private final String SAVE_SQL = "INSERT INTO products(name, category_id, image, price) VALUES (?,?,?,?)";
    private final String UPDATE_SQL = "UPDATE products SET name = ?, category_id = ?, image = ?, price = ? WHERE id = ?";
    private final String DELETE_SQL = "DELETE FROM products WHERE id = ?";

    public ArrayList<Product> findAll() {
        ArrayList<Product> listReturn = new ArrayList<>();

        conn = DBUtil.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(FINDALL_SQL);
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("categoryName"), rs.getString("image"),rs.getInt("price"));
                listReturn.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, pst, conn);
        }
        return listReturn;
    }

    public Product findById(int id) {
        Product product = null;
        conn = DBUtil.getConnection();   
        try {
            pst = conn.prepareStatement(FINDBYID_SQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("categoryName"), rs.getString("image"),rs.getInt("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, pst, conn);
        }
        return product; 
    }

    public void save(Product product) {
        conn = DBUtil.getConnection();
        try {
            pst = conn.prepareStatement(SAVE_SQL);
            pst.setString(1, product.getName());
            pst.setInt(2, product.getIdCategory());
            pst.setString(3, product.getImage());
            pst.setInt(4, product.getPrice());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }

    }

    public void delete(int id) {
        conn = DBUtil.getConnection();
        try {
            pst = conn.prepareStatement(DELETE_SQL);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
    }

    public void update(Product product) {
        conn = DBUtil.getConnection();
        try {
            pst = conn.prepareStatement(UPDATE_SQL);
            pst.setString(1, product.getName());
            pst.setInt(2, product.getIdCategory());
            pst.setString(3, product.getImage());
            pst.setInt(4, product.getPrice());
            pst.setInt(5, product.getId());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
    }
}
