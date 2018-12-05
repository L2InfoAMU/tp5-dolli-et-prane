package image;

import javafx.scene.paint.Color;
import util.Matrices;

import static util.Matrices.*;

public abstract class RasterImage implements Image{
    protected int width;
    protected int height;

    public abstract void createRepresentation();
    public abstract void setPixelColor(Color color, int x , int y);

    RasterImage(Color color, int width, int height){
        this.width = width;
        this.height= height;
        createRepresentation();
        setPixelsColor(color);
    }

    RasterImage(Color[][] colors){
        requiresNonNull(colors);
        this.setHeight(Matrices.getColumnCount(colors));
        this.setWidth((Matrices.getRowCount(colors)));
        createRepresentation();

        setPixelsColor(colors);
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

    public void setPixelsColor(Color[][] pixels) {
        for(int i = 0; i < this.width; i++){
            for(int j = 0 ;j<this.height; j++) {
                setPixelColor(pixels[i][j],i,j);
            }
        }

    }


    public void setPixelsColor(Color color) {
        for(int i = 0; i < this.width; i++){
            for(int j = 0 ;j<this.height; j++){
                setPixelColor(color,i,j);
            }
        }
    }

}
