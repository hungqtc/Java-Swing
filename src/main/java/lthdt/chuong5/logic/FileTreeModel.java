/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Fox0fNight
 */
public class FileTreeModel implements TreeModel{
     DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
    public FileTreeModel(String rootDirect) {
        //Khoi tao nut goc
        rootNode =  new DefaultMutableTreeNode(new File(rootDirect));
        //Khoi tao cay
        buildDirectoryTree(rootNode, rootDirect);
        tree =  new DefaultTreeModel(rootNode);
    }
    //Tao cay thu muc
    private void buildDirectoryTree(DefaultMutableTreeNode node,String rootDirect){
        
         File currDirect = new File(rootDirect);
//         DefaultMutableTreeNode root = new DefaultMutableTreeNode(currDirect);
         
         if(!currDirect.isDirectory()){
             return;
         }
         File[] list = currDirect.listFiles();
         for (File list1 : list) {
             DefaultMutableTreeNode child = new DefaultMutableTreeNode(list1);
             node.add(child);
             buildDirectoryTree(child, rootDirect+File.separator + list1.getName());
         }
         
         
        
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    @Override
    public Object getRoot() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
    //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.removeTreeModelListener(l);
    }
}
