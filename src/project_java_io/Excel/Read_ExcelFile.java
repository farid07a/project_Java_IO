/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java_io.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author horizon
 */
public class Read_ExcelFile {
    
    public static void main(String[] args) {
        
        File file = new File("C:\\demo\\employee.xlsx");   //creating a new file instance  
FileInputStream fis = null;
        try {
            fis = new FileInputStream(file); //obtaining bytes from the file
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read_ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
        }
//creating Workbook instance that refers to .xlsx file  
   //iterating over excel file 
    }
    
}
