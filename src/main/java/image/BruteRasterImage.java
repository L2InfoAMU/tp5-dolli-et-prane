package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    private int width;
    private int height;
    private Color[][] pixels;


    public Color getPixelColor(int x, int y){
        return this.pixels[y][x];
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

}
