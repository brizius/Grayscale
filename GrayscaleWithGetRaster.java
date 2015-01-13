import java.awt.image.WritableRaster;
import java.awt.image.BufferedImage;


public BufferedImage makeGrayRaster(BufferedImage colorImg)
{
	WritableRaster wr= colorImg.getRaster();
	for (int x = 0; x < colorImg.getWidth(); ++x)
	        for (int y = 0; y < colorImg.getHeight(); ++y)
		{				
			int[] pixel = wr.getPixel(x, y, new int[3]);
			int grayLevel= (pixel[0]+pixel[1]+pixel[2])/3;
			pixel[0]=grayLevel;
			pixel[1]=grayLevel;
			pixel[2]=grayLevel;
			wr.setPixel(x,y,pixel);
		}
	colorImg.setData(wr);
	return colorImg;
}
