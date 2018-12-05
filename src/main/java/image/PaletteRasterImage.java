package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

import static util.Matrices.*;

public class PaletteRasterImage extends RasterImage implements  Image{


    private List <Color> palette;
    private int[][] indexOfColors;


    public PaletteRasterImage(Color color,int width, int height){
        super(color,width,height);
    }

    public PaletteRasterImage(Color[][] colors){
        super(colors);
    }

    public void createRepresentation(){
        this.palette = new ArrayList<>();
        this.indexOfColors = new int[this.width][this.height];

    }

    public Color getPixelColor(int x , int y){
        return this.palette.get(indexOfColors [x][y]);
    }



    public void setPixelColor(Color color, int x, int y){
       if(!this.palette.contains(color)){
           this.palette.add(color);
           this.indexOfColors[x][y] = palette.indexOf(color);
       }else this.indexOfColors[x][y] = palette.indexOf(color);
    }

}
