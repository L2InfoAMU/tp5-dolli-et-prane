package image;

import javafx.scene.paint.Color;
import util.Matrices;

import static util.Matrices.*;

public class BruteRasterImage extends RasterImage implements Image{


    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        super(color,width,height);
    }

    public BruteRasterImage(Color[][] colors){
        super(colors);
    }

    public void createRepresentation(){
        this.pixels = new Color[this.width][this.height];
    }



    public Color getPixelColor(int x , int y){
        return this.pixels[x][y];
    }



    public void setPixelColor(Color color, int x, int y){
        this.pixels[x][y] = color;
    }



}
