/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Multiple_Line_Addition;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author SOFTWARE2
 */
public class Multiple_Line_Addition {

    public static void main(String[] args) {

        try {
           
            //Loading an existing document
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\3. JEE Mapeo de entidades.pdf");
            PDDocument doc = PDDocument.load(file);
            
            //Creating a PDF Document
            PDPage page = doc.getPage(0);
            
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);
            
            //Begin the Content stream 
            contentStream.beginText();
            
            //Setting the font to the Content stream
            contentStream.setFont(PDType1Font.TIMES_ROMAN, 16);
            
            //Setting the leading
            contentStream.setLeading(14.5f);
            
            //Setting the position for the line
            contentStream.newLineAtOffset(25, 700);
            
            String text1 = "this is an example of adding text to a page in the pdf  document we can add as many lines";
            String text2 = "as we want like this usig the ShowText() method the ContentSTream class";
            
            //Adding text in the form of string
            contentStream.showText(text1);
            contentStream.newLine();
            contentStream.showText(text2);
            //Ending the content stream
            contentStream.endText();
            
            System.out.println("Content added");
            
            //Closing the content stream
            contentStream.close();
            
            //Saving the document
            doc.save("C:\\Users\\SOFTWARE2\\Desktop\\NewC05.pdf");
            
            //Closing the document
            doc.close();
            
                    
            
        } catch (IOException ex) {
            Logger.getLogger(Multiple_Line_Addition.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
