/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Encryption_Of_A_Document;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

/**
 *
 * @author SOFTWARE2
 */
public class Encryption_Of_A_Document {
    
    public static void main(String[] args) {
    
        try {
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\NewC05.pdf");
            PDDocument document = PDDocument.load(file);
            int keyLength = 128;

            AccessPermission ap = new AccessPermission();
            
            ap.setCanPrint(false);
            
            StandardProtectionPolicy spp = new StandardProtectionPolicy("1234", "", ap);
            
            spp.setEncryptionKeyLength(keyLength);
            
            spp.setPermissions(ap);
            
         
            
            document.protect(spp);
            
            System.out.println("Document encrypted");
            
            document.save("C:\\Users\\SOFTWARE2\\Desktop\\NewC06.pdf");
            
            document.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Encryption_Of_A_Document.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    
    
    
}
