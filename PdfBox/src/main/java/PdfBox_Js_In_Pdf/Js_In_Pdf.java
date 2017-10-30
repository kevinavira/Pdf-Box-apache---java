/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Js_In_Pdf;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript;

/**
 *
 * @author SOFTWARE2
 */
public class Js_In_Pdf {
    public static void main(String[] args) {
    
        
        try {
            
            //Loading an existing file
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\NewC05.pdf");
            PDDocument document = PDDocument.load(file);
            
            String javaScript = "app.alert({cMsg: 'this is an example', nIcon: 3, nType: 0, cTitle: 'PDFBox javascript example'});";
            
            //Creating PDActionJavaScript object
            PDActionJavaScript PDAjavascript = new PDActionJavaScript(javaScript);
            
            //Embedding java script
            document.getDocumentCatalog().setOpenAction(PDAjavascript);
            
            //Saving the document
            document.save(new File("C:\\Users\\SOFTWARE2\\Desktop\\js1.pdf"));
            
            System.out.println("data added to the given PDF");
            
            //Closing the document
            document.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Js_In_Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
}
