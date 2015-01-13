import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

BufferedImage grayscaleWithDrawImage(BufferedImage colorImg){
        BufferedImage bwImg = new BufferedImage(colorImg.getWidth(), colorImg.getHeight(), BufferedImage.TYPE_BYTE_GRAY);  
	Graphics2D g = bwImage.createGraphics();
        g.drawImage(colorImg, 0, 0, null);  
        g.dispose();
        return bwImg;
}
