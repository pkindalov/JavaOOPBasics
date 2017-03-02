package EncapsulationExercises;

/**
 * Created by r3v3nan7 on 24.02.17.
 */
public class Box {

    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public Double sourfaceArea(){
        double area = 0d;
        area = 2 * (this.length * this.width) + 2 * (this.length * this.height) + 2 * (this.width * this.height);

        return area;
    }


    public Double literalSourfaceArea(){
        double area = 0d;
        area = (2 * this.length * this.height) + 2 * (this.width * this.height);

        return area;
    }


    public Double volume(){
        double volume = 0d;
        volume = (this.length * this.width * this.height);

        return volume;
    }








}
