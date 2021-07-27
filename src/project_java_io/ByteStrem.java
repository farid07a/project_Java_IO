/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ByteStrem {
    //input input data //Output outputdate
    public static void main(String[] args) {
        FileInputStream fi=null;
        FileOutputStream fout=null;
        System.out.println("initialsation..."); 
        
        try {
            fi=new FileInputStream(new File("text.txt"));
            
            
            System.out.println("FileInputStream printing");
            fout=new FileOutputStream("C:\\Users\\horizon\\Desktop\\textout.txt");
            System.out.println("FileOutputStream printing");
            int i;
            while ((i=fi.read())!=-1) {                
                fout.write(i);
                System.out.println(i+"writing in file ");
            }
            fi.close();
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ByteStrem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ByteStrem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
