/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhmedFadel.doc.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author horizon
 */
public class BuffredInputStream_ex {
    
  /*************
   * BufferStream Class help to create it array of byte for source file 
   * and write byte from memory to array
   * memory read and write is fast than Head HardDisk and memory is low fast for CPU like 1000 time 
   * @throws IOException 
   */
    
    
    
    public void ReadFileAndWrite_with_BufferByte() throws IOException{
    String path="D:\\testDir\\";
        String fileImg="back_cad.jpg";
        
        FileInputStream fin=new FileInputStream(path+fileImg);
        
        FileOutputStream fos=new FileOutputStream(path+"CopyNew"+fileImg);
        BufferedInputStream bufInpStr;
        
        bufInpStr = new BufferedInputStream(fin); // this class Buffer Create array Of byte by itself and filled its array automticaly
        BufferedOutputStream bfrOutStrm;          // from the contain input stream 'create array bytes in memory'
        bfrOutStrm = new BufferedOutputStream(fos);
         int x;
        while ((x=bufInpStr.read())!=-1) {    // read byte by byte from array byte in memory [ ]
            System.out.println(x);
            bfrOutStrm.write(x);  // write byte from array byte in array 
   
        }

        
        
        
        
         bufInpStr.close();
       bfrOutStrm.close();
        
        fin.close();
        fos.close();
//        bufInpStr.close();
//        bfrOutStrm.close();
        
        
    
    
    
    
    }
    
    
    
    
    
    public static void main(String[] args) {
        try {
            new BuffredInputStream_ex().ReadFileAndWrite_with_BufferByte();
        } catch (IOException ex) {
            Logger.getLogger(BuffredInputStream_ex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
