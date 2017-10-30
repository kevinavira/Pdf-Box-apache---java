/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Insert_Image;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author SOFTWARE2
 */
public class Insert_Image {
    
    public static void main(String[] args) {
        
        
        try {
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\NewC04.pdf");
            PDDocument doc = PDDocument.load(file);
            
            PDPage page =  doc.getPage(0);
            
            PDImageXObject pdimage = PDImageXObject.createFromFile("C:\\Users\\SOFTWARE2\\Pictures\\lexco.png", doc);
            
            PDPageContentStream contents = new PDPageContentStream(doc, page);
            
            contents.drawImage(pdimage, 70, 250);
            
            System.out.println("Image Inserted");
            
            contents.close();
            
            doc.save("C:\\Users\\SOFTWARE2\\Desktop\\Image.pdf");
            
            doc.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Insert_Image.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
