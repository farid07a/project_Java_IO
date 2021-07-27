/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java_io;

import java.io.File;
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
public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader  frd=null;
        FileWriter fwr=null;
        try {
            frd=new FileReader(new File("text.txt"));
            fwr=new FileWriter(new File("FrileRedtext.txt"));
            int i;
            while ((i=frd.read())!=-1) {                
                fwr.write(i);   
                System.out.println("The Caracteres is:"+(char)i);
            }
            
            
            System.out.println("succesfull Copier");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            if (frd!=null) {
                frd.close();
            }
            if (fwr!=null) {
                fwr.close();
            }
            
        }
        
        
    }
   
}
