package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

public class BruteRasterImage implements Image{

    private int width;
    private int height;
    private Color[][] pixels;
    private Color color;

    public BruteRasterImage(Color color, int width, int height){
        this.color = color;
        this.width = width;
        this.height= height;
    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        this.pixels = colors;
    }


    public Color getPixelColor(int x, int y){
        return this.pixels[y][x];
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPixels(Color[][] pixels) {
        this.pixels = pixels;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPixelColor(Color color, int x, int y){
        this.pixels[y][x] = color;
    }


}
