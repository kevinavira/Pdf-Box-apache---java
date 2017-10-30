/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_document_properties;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author SOFTWARE2
 */
public class document_properties {

    public static void main(String[] args) throws IOException {

        //Creating PDF document object
        PDDocument document = new PDDocument();

         //Creating a blank page
        PDPage blankPage = new PDPage();
        
        //Adding the blank page to the document
        document.addPage(blankPage);
        
        //Creating the PDDocumentInformation object 
        PDDocumentInformation pdd = document.getDocumentInformation();
        
        //Setting the author of the document
        pdd.setAuthor("Tutorial");
        
         // Setting the title of the document
        pdd.setTitle("esto debe ser el titulo");
        
       //Setting the creator of the document
        pdd.setCreator("aca debe estar el creador ");
        
        //Setting the subject of the document
        pdd.setSubject("aca debe esta el asunto");
        
        //Setting the created date of the document
        Calendar date = new GregorianCalendar();
        date.set(2017, 10, 20);
        pdd.setCreationDate(date);
        
                
         //Setting the modified date of the document
        date.set(2018, 1, 1);
        pdd.setModificationDate(date);
        
        //Setting keywords for the document 
        pdd.setKeywords("sample, firt exemplo, my pdf");
        
        //Saving the document
        document.save("C:\\Users\\SOFTWARE2\\Desktop\\Documet_propierties.pdf");
        
        
        
        System.out.println("succesfully");
        
        //Closing the document
        document.close();
        
    }

}
