import java.io.File;
import net.sourceforge.tess4j.*;
import net.sourceforge.tess4j.util.LoadLibs;

public class TesseractExample {
    public static void main(String[] args) {
        // System.setProperty("jna.library.path", "32".equals(System.getProperty("sun.arch.data.model")) ? "lib/win32-x86" : "lib/win32-x86-64");

        //File imageFile = new File("eurotext.tif");
    	File imageFile = new File("image2019-03-07-151326.tif");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        File tessDataFolder = LoadLibs.extractTessResources("tessdata");
        instance.setDatapath(tessDataFolder.getPath());
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        // File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Maven build bundles English data
        // instance.setDatapath(tessDataFolder.getPath());

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}