/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fox0fNight
 */
public class FileAndDirectoryOperation {

    public FileAndDirectoryOperation() {
    }
    //liet ke
    public File[] getDirectoryContent (String folder){
        File directory = new File(folder);
        if(directory.isFile()){
            return null;
        }
        File[] results = directory.listFiles();
        return results;  
    }
    //Hien thi
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<content.length;i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getParent());
            sb.append("\n");
        }
        return sb.toString();
    }
    //Loai ra thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<> ();
        for (int i = 0;i<content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
                
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    } 
    //loai ra file
       public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<> ();
        for (int i = 0;i<content.length;i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }     
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
      // duyet de quy
       public void getContentRecursively(String folder){
           File content = new File(folder);
           
           if(content.isFile()){
               System.out.println(content.getPath()+File.separator+content.getName());
               return;
           }
           System.out.println("Thu muc: "+folder);
           File[] sub = content.listFiles();
           for(int i=0;i<sub.length;i++){
               getContentRecursively(folder+File.separator+sub[i].getName());
           }
           
       }
       
       // doc file van ban
       public String readTextFile(String filename) throws IOException{
           StringBuilder content =  new StringBuilder();
           
        try {
            //mo file
            FileReader fr = new FileReader(filename);
            //dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line  = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return "Khong tim thay file"+filename;
        }catch(IOException ex){
            return "Khong tim thay file"+filename;
        }
           
           return content.toString();
       }
       
       // Luu tap tin van ban
       public boolean writeTextFile(String filename, String content){
           boolean flag = true;//luu thanh cong
        try {
            //mo file
            FileWriter fw = new FileWriter(filename);
            //bo dem
            BufferedWriter bw = new BufferedWriter(fw);
            
            //ghi ra file
            bw.write(content);
            //dong file
            bw.flush();
            bw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            return false;
        }
           return flag;
       }
       
}
