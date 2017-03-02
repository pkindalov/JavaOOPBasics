package EncapsulationExercises;

/**
 * Created by r3v3nan7 on 24.02.17.
 */
public class Box {

    private Double length;
    private Double width;
    private Double height;

    private void setLength(Double length){
        if(length == 0 || length < 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        this.length = length;
    }


    private void setWidth(Double width){
        if(width == 0 || width < 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

        this.width = width;
    }


    private void setHeight(Double height){
        if(height == 0 || height < 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

        this.height = height;
    }




    public Box(Double length, Double width, Double height){

        setLength(length);
        setWidth(width);
        setHeight(height);
//        this.length = length;
//        this.width = width;
//        this.height = height;
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
