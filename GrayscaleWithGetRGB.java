import java.awt.image.BufferedImage;

public BufferedImage grayscaleWithGetRGB(BufferedImage img){
	for (int x = 0; x < img.getWidth(); ++x){
		for (int y = 0; y < img.getHeight(); ++y){
			int rgb = img.getRGB(x, y);
			int r = (rgb >> 16) & 0xFF;
			int g = (rgb >> 8) & 0xFF;
			int b = (rgb & 0xFF);

			int grayValue = (r + g + b) / 3;
			int gray = (grayValue << 16) + (grayValue << 8) + grayValue; 
			colorImg.setRGB(x, y, gray);
		}
	}
	return img;
}
