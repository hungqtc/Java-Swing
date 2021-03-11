/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.dao;

import DemoDB.model.Category;
import DemoDB.utils.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CategoryDAO {

    private Connection conn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private final String FINDALL_SQL = "SELECT * FROM categories";
    private final String FINDBYID_SQL = "SELECT * FROM categories WHERE id = ?";
    private final String SAVE_SQL = "INSERT INTO categories(name) VALUES (?)";
    private final String UPDATE_SQL = "UPDATE categories SET name = ? WHERE id = ?";
    private final String DELETE_SQL = "DELETE FROM categories WHERE id = ?";

    public ArrayList<Category> findAll() {
        ArrayList<Category> listCate = new ArrayList<>();

        conn = DBUtil.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(FINDALL_SQL);
            while (rs.next()) {
                Category cat = new Category(rs.getInt("id"), rs.getString("name"));
                listCate.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, pst, conn);
        }
        return listCate;
    }

    public Category findById(int id) {
        Category cat = null;
        conn = DBUtil.getConnection();   
        try {
            pst = conn.prepareStatement(FINDBYID_SQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                cat = new Category(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
        return cat;
    }

    public void save(Category cat) {
        conn = DBUtil.getConnection();
        try {
            pst = conn.prepareStatement(SAVE_SQL);
            pst.setString(1, cat.getName());
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

    public void update(Category cat) {
        conn = DBUtil.getConnection();
        try {
            pst = conn.prepareStatement(UPDATE_SQL);
            pst.setString(1, cat.getName());
            pst.setInt(2, cat.getId());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
    }
}
