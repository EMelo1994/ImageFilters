import java.awt.Color;
/**
 * Write a description of class GrayScaleFilter here.
 * 
 * @author (Erick Melo) 
 * @version (12.5.2015)
 */
public class GrayScaleFilter extends Filter
{

    /**
     * Constructor for objects of class GrayscaleFilter.
     * @param name The name of the filter.
     */
    public GrayScaleFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int average = (int)  ((float) (image.getPixel(x,y).getRed() +
                                      image.getPixel(x,y).getGreen() +
                                      image.getPixel(x,y).getBlue())/3);
                image.setPixel(x,y, new Color(average, average, average));
            }
        }
    }

}