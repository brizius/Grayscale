import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics2D;
import javax.swing.GrayFilter;

public class GrayscaleWithGrayFilter{

        public BufferedImage grayFilter(BufferedImage colorImg){

		ImageFilter filter = new GrayFilter(true, 50);  
		ImageProducer producer = new FilteredImageSource(colorImg.getSource(), filter);  
		Image image = Toolkit.getDefaultToolkit().createImage(producer);
		return toBufferedImage(image);
        }

        public  BufferedImage toBufferedImage(Image image) {
	        
	        if (image instanceof BufferedImage) {
		        return (BufferedImage)image;
	        }

	        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
	        Graphics2D g = bimage.createGraphics();
	        g.drawImage(image, 0, 0, null);
	        g.dispose();
	        return bimage;
        }
}
