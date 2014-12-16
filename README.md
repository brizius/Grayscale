Different RGB to Grayscale conversion methods
================
GrayscaleWithColorConvert: changes color space using java.awt.color.ColorSpace.

GrayscaleWithDraImage: builds new BufferedImage with TYPE_BYTE_GRAY image type and draws old image into new one using Graphics2D.drawImage.

GrayscaleWithGetRGB: gets pixel value using getRGB, computes average value (R+G+B)/3 and sets new RGB value.

GrayscaleWithGetRaster: same as GrayscaleWithGetRGB but faster because it uses raster from BufferedImage instead of slow getRGB method.

GrayscaleWithGrayFilter: uses GrayFilter to grayscale Image and toBufferedImage() for conversion.


