/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDB.dao;

import DemoDB.model.User;
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
public class UserDAO {
    private Connection conn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private final String FINDALL_SQL = "SELECT * FROM users";
    private final String FINDBYID_SQL = "SELECT * FROM users WHERE id = ?";
    private final String FINDBYUSERNAMEPASSWORD_SQL = "SELECT * FROM users WHERE username = ? AND password = ?";
    private final String SAVE_SQL = "INSERT INTO users(name) VALUES (?)";
    private final String UPDATE_SQL = "UPDATE users SET name = ? WHERE id = ?";
    private final String DELETE_SQL = "DELETE FROM users WHERE id = ?";

    public ArrayList<User> findAll() {
        ArrayList<User> listUser = new ArrayList<>();

        conn = DBUtil.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(FINDALL_SQL);
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, pst, conn);
        }
        return listUser;
    }

    public User findById(int id) {
        User user = null;
        conn = DBUtil.getConnection();   
        try {
            pst = conn.prepareStatement(FINDBYID_SQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
        return user;
    }
    
     public boolean findByUserNamePassword(User user) {
        conn = DBUtil.getConnection();
        boolean flag = true;
        try {
            pst = conn.prepareStatement(FINDBYUSERNAMEPASSWORD_SQL);
            pst.setString(1, user.getName());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            if (!rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pst, conn);
        }
        return flag;
    }
//
//    public void save(user cat) {
//        conn = DBUtil.getConnection();
//        try {
//            pst = conn.prepareStatement(SAVE_SQL);
//            pst.setString(1, cat.getName());
//            pst.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DBUtil.close(pst, conn);
//        }
//
//    }
//
//    public void delete(int id) {
//        conn = DBUtil.getConnection();
//        try {
//            pst = conn.prepareStatement(DELETE_SQL);
//            pst.setInt(1, id);
//            pst.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DBUtil.close(pst, conn);
//        }
//    }
//
//    public void update(user cat) {
//        conn = DBUtil.getConnection();
//        try {
//            pst = conn.prepareStatement(UPDATE_SQL);
//            pst.setString(1, cat.getName());
//            pst.setInt(2, cat.getId());
//            pst.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DBUtil.close(pst, conn);
//        }
//    }
}
