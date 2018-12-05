package image;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage {

    HashMap<Point,Color> pixelsHap;

    public SparseRasterImage(Color color,int width, int height){
        super(color,width,height);
    }

    public SparseRasterImage(Color[][] colors){
        super(colors);
    }


    @Override
    public void createRepresentation() {
        this.pixelsHap = new HashMap<>();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        pixelsHap.put(new Point(x,y),color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixelsHap.getOrDefault(new Point(x,y),Color.WHITE);
    }


}
