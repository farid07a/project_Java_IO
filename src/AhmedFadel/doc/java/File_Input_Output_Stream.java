/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhmedFadel.doc.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author horizon
 */
public class File_Input_Output_Stream {
    
    
    public static void main(String[] args) {
        try {
            String Path="D:\\testDir\\";  // point for Directory Drive in D:\\ testDir\\
            String NameFile="back_cad.jpg";// name of image file
            File fileImg=new File(Path+NameFile);//D:\\testDir\\abc.bmp
            FileOutputStream fos;
            try ( //1- step to open stream with files
                    FileInputStream fin = new FileInputStream(fileImg) // open a Stream with this code By the fileImage
            ) {
                fos = new FileOutputStream(Path+"CopyOf"+NameFile); // open a Stream with this code By the COPY OF fileImage
                // 2- Steps of read and Write
                int a; // 4 byte of int  0-255
                
                long  StartTime=System.nanoTime();
                
                while ((a=fin.read())!=-1) {  // read from file one Byte 'first byte of a '00000000 2byt 3byt 4byt' and affected to a and test by end the file "end file==-1" ()
                    
                    System.out.println(a);
                    System.out.println(Integer.toBinaryString(a));
                    
                    fos.write(a);
                }
                long endTime=System.nanoTime();
                
                System.out.println((endTime-StartTime)/1000000 +"MiliSecond"); // get Time With MiliSecond 
                
            } // open a Stream with this code By the COPY OF fileImage
            fos.close();
            
            
        } catch (IOException e) {
        }
        
        
    }
}
