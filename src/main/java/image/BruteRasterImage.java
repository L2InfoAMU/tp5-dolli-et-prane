package image;

import javafx.scene.paint.Color;
import util.Matrices;

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
        createRepresentation();
        for(int i = 0; i< this.width;i++){
            for(int j = 0; j< this.height; j++){
                this.pixels[i][j] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        this.setWidth(Matrices.getRowCount(colors));
        this.setHeight(Matrices.getColumnCount(colors));
        createRepresentation();
        for(int i = 0;i< this.width;i++){
            for(int j = 0 ; j < this.height; j++){
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

    public void setPixelsColor(Color[][] pixels) {
        for(int i = 0; i < this.width; i++){
            for(int j = 0 ;j<this.height; j++) {
                this.pixels[i][j] = pixels[i][j];
            }
        }

    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPixelsColor(Color color) {
        for(int i = 0; i < this.width; i++){
            for(int j = 0 ;j<this.height; j++){
                this.pixels [i][j] = color;
            }
        }
    }

    public void setPixelColor(Color color, int x, int y){
        this.pixels[x][y] = color;
    }



}
