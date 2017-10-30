/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PdfBox_Extract_Pictures;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

/**
 *
 * @author SOFTWARE2
 */
public class Extract_Pictures {

    public static void main(String[] args) {

        try {
            //Loading an existing PDF document
            File file = new File("C:\\Users\\SOFTWARE2\\Desktop\\3. JEE Mapeo de entidades.pdf");
            PDDocument document = PDDocument.load(file);

            //Instantiating the PDFRenderer class
            PDFRenderer renderer = new PDFRenderer(document);

            for (int i = 0; i < 10; i++) {

                //Rendering an image from the PDF document
                BufferedImage image = renderer.renderImage(i);

                //Writing the image to a file
                //ImageIO.write(image, "jpg" , new File("C:\\Users\\SOFTWARE2\\Desktop\\"+i+".jpg"));
                ImageIO.write(image, "png", new File("C:\\Users\\SOFTWARE2\\Desktop\\imagen" + i + ".png"));
            }

            //Closing the document
            document.close();

        } catch (IOException ex) {
            Logger.getLogger(Extract_Pictures.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
