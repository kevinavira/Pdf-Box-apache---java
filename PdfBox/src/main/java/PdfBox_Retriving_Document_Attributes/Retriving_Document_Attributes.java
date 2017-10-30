/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Retriving_Document_Attributes;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

/**
 *
 * @author SOFTWARE2
 */
public class Retriving_Document_Attributes {
    
    public static void main(String[] args) throws IOException {
        
        //Loading an existing document
        File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\Documet_propierties.pdf");
        PDDocument document = PDDocument.load(file);
        
        //Getting the PDDocumentInformation object
        PDDocumentInformation pdd = document.getDocumentInformation();
        
        //Retrieving the info of a PDF document
        System.out.println("Author of the documets is :"+ pdd.getAuthor());
        System.out.println("Title of the document is :"+pdd.getTitle());
        System.out.println("Subjet of the documet is :"+pdd.getSubject());
        
        
        System.out.println("Creator of the document is :"+pdd.getCreator());
        System.out.println("Creation date of the document is : "+pdd.getCreationDate());
        System.out.println("Modification date of the document is : "+pdd.getModificationDate());
        System.out.println("Keywords of the deocument are: "+pdd.getKeywords());
        
        //Closing the document
        document.close();
        
        
    }
}
