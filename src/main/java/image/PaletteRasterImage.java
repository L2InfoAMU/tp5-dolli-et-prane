package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

public class PaletteRasterImage implements  Image{

    private Color color ;
    private int width ;
    private int height ;
    private Color[][] pixels ;


    public PaletteRasterImage(Color color,int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
        createRepresentation();
        for(int i = 0;i<this.width;i++){
            for(int j=0; j< this.height;j++){
                this.pixels[i][j] = color;
            }
        }
    }

    public PaletteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        createRepresentation();
        for(int i = 0;i<this.width;i++){
            for(int j=0; j< this.height;j++) {
                this.pixels[i][j] = colors[i][j];
            }
        }
    }

    public void createRepresentation(){
        this.pixels = new Color[this.width][this.height];
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public Color getPixelColor(int x , int y){
        return this.pixels[x][y];
    }

}
