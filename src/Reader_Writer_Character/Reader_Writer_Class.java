/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader_Writer_Character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author horizon
 */
public class Reader_Writer_Class {
    
    
    public void ReaderWriter(){
        FileReader frd=null;
        FileWriter fwr=null;
        try {
            String path="D:\\testDir\\";
            String fileImg="account.txt";
            frd = new FileReader(path+fileImg);
             fwr=new FileWriter(path+"copyof "+fileImg);
            int a;
            
            while ((a=frd.read())!=-1) {                
                
                System.out.println(a);
                 System.out.println(Integer.toBinaryString(a));
                fwr.write(a);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader_Writer_Class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reader_Writer_Class.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                frd.close();
                fwr.close();
            } catch (IOException ex) {
                Logger.getLogger(Reader_Writer_Class.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    
    }
    
    public static void main(String[] args) {
        
        
        new Reader_Writer_Class().ReaderWriter();
        
        
    }
    
}
