import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.color.ColorSpace;

BufferedImage grayscaleWithColorConvert(BufferedImage img) {
	ColorConvertOp colorConvert = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
	colorConvert.filter(img, img);
	return img;
}
