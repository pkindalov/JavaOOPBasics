package EncapsulationExercises.ClassData.PizzaCalories;

/**
 * Created by r3v3nan7 on 26.02.17.
 */
public class Topping {

    private String toppingType;
    private String originalToppingValue;
    private int weight;

    public void setToppingType (String topping){
//        String originalToppingValue = topping;
        topping = topping.toLowerCase();

        if(topping.equals("") || topping.equals(" ")){
            throw new IllegalArgumentException("Toppping cannot be empty");
        }

        if(topping.length() < 4){
            throw new IllegalArgumentException("Too short");
        }

        if(!topping.equals("meat") && !topping.equals("veggies") && !topping.equals("cheese") && !topping.equals("sauce") ){
            throw new IllegalArgumentException("Cannot place " + this.originalToppingValue + " on top of your pizza.");
        }

        this.toppingType = topping;
    }





    public void setWeight(int weight){
        //to make validation here later

        if(weight < 1 || weight > 50){
            throw new IllegalArgumentException(this.originalToppingValue + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }


    public Topping(String toppingType, int weight){
        this.originalToppingValue = toppingType;
        setToppingType(toppingType);
        setWeight(weight);
    }


    public Double getCaloriesPerGram(){
        return caloriesPerGram(this.toppingType, this.weight);
    }



    private Double caloriesPerGram(String toppingType, int weight){
        double result = 0d;
        double modifier = 0d;
        toppingType = toppingType.toLowerCase();

        if(toppingType.equals("meat")){
            modifier = 1.2;
        }else if(toppingType.equals("veggies")){
            modifier = 0.8;
        }else if(toppingType.equals("cheese")){
            modifier = 1.1;
        }else if(toppingType.equals("sauce")){
            modifier = 0.9;
        }


        result = 2 * modifier * weight;

        return result;
    }



}
