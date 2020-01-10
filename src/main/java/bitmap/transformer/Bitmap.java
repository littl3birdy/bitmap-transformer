package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    //instance variables
    File bitFile;
    File newBitFile;
    String newName;

    //define the constructor
    public Bitmap (String inputPath, String outputPath, String newName) {
        this.bitFile = new File(inputPath);
        this.newBitFile = new File(outputPath + "/" + newName);
        this.newName = newName;
    }

    //instance methods
    public void bitOutputFile (BufferedImage bit) {
        try {

            ImageIO.write(bit, "bmp", this.newBitFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Bitmap bitTransformBlackWhite () {

        try {
            BufferedImage bitOG = ImageIO.read(this.bitFile);
//            BufferedImage bitMono = bitOG.setRGB(0, 0, 10);

            this.bitOutputFile(bitOG);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Bitmap bitTransformThree () {

        return null;
    }

}
