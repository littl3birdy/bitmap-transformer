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
    public void bitOutputFile (BufferedImage bit, String bitPath) {
        try {

            ImageIO.write(bit, "bmp", new File(bitPath));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Bitmap bitTransformBlackWhite () {

        BufferedImage bitOG = ImageIO.read(this.bitFile);
        BufferedImage bitMono = new BufferedImage(bitOG.getWidth(), bitOG.getHeight(), BufferedImage.TYPE_BYTE_BINARY);

        return null;
    }

    public Bitmap bitTransformThree () {

        return null;
    }

}
