/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_creation_pdf;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 *
 * @author SOFTWARE2
 */
public class Creation_pdf {
    
    public static void main(String[] args) throws IOException {
        
        //Se crea PDf documeto objeto
        PDDocument document = new PDDocument();
        
        //se guarda la ruta 
        document.save("C:\\Users\\SOFTWARE2\\Desktop\\PdfBox.pdf");
        
        //impresion opcional
        System.out.println("Successful PDF");
        
    }
    
}
