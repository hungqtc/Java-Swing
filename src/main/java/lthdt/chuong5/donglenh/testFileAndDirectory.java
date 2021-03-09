/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package lthdt.chuong5.donglenh;


import java.io.File;
import lthdt.chuong5.logic.FileAndDirectoryOperation;
/**
 *
 * @author Fox0fNight
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperation fo = new FileAndDirectoryOperation();
        File[] content = fo.getDirectoryContent("D:\\Test");
        
//        System.out.println(fo.displayContent(content));

//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach thu muc con la:");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sach thu muc con la:");
//        System.out.println(fo.displayContent(taptin));        

        fo.getContentRecursively("D:\\Test");
    }
    
}
