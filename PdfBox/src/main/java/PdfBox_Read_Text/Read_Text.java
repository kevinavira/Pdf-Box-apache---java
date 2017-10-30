/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Read_Text;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author SOFTWARE2
 */
public class Read_Text {
    
    public static void main(String[] args) {
        
        
        try {
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\3. JEE Mapeo de entidades.pdf");
            PDDocument document = PDDocument.load(file);
            
            PDFTextStripper pdfStripper = new PDFTextStripper();
            
            String text=pdfStripper.getText(document);
            System.out.println("que tengo :"+text);
            
            document.close();
                    
                    
        } catch (IOException ex) {
            Logger.getLogger(Read_Text.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
