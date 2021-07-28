/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhmedFadel.doc.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author horizon
 */
public class BuffredStreamByteArray_InputStream_OutStream_File {
    
    public static void ReadFileWithByteArray() throws IOException{
    
        String path="D:\\testDir\\";
        String fileImg="back_cad.jpg";
        
        FileInputStream fin=new FileInputStream(path+fileImg);
        
        FileOutputStream fos=new FileOutputStream(path+"CopyF"+fileImg);
        
        byte arr[]=new byte[1024]; //1kbyte ==1024 byte this methode evry iteration write 1024 byte in file 
                                    // the size file created > origin file because last byte array created automaticaly 1024 
                                    // some cases empty but created in file     
        int i=0,a;
        while ((a=fin.read(arr))!=-1) { // to solve this prb write the size correct reading by fun read()            
            
            fos.write(arr,0,a); // a lenght of array readed by read() ex: read 830 byte not 1024 => write 830byte only
            System.out.println("iter :"+ ++i);
        }
        
        fin.close();
        fos.close();
        
    
    }
    
    public static void main(String[] args) {
        try {
            BuffredStreamByteArray_InputStream_OutStream_File.ReadFileWithByteArray();
        } catch (IOException ex) {
            Logger.getLogger(BuffredStreamByteArray_InputStream_OutStream_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
