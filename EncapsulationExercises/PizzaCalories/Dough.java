package EncapsulationExercises.ClassData.PizzaCalories;

/**
 * Created by r3v3nan7 on 25.02.17.
 */
public class Dough {

    private String flourType;
    private String bakingTechnique;
    private int weight;


    private void setFlourType(String flourType){
        flourType = flourType.toLowerCase();

        if(flourType.equals("") || flourType.equals(" ")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        if(flourType.length() < 5){
            throw new IllegalArgumentException("Invalid type of dough.");
        }


        if(!flourType.equals("white") && !flourType.equals("wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }


        this.flourType = flourType;

    }


    private void setBakingTechnique(String bakingTechnique){

        bakingTechnique = bakingTechnique.toLowerCase();

        if(bakingTechnique.equals("") || bakingTechnique.equals(" ")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        if(bakingTechnique.length() < 5){
            throw new IllegalArgumentException("Invalid type of dough.");
        }


        if(!bakingTechnique.equals("crispy") && !bakingTechnique.equals("chewy") && !bakingTechnique.equals("homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;


    }


    public void setWeight(int weight){
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }




    public Dough(String flourType, String bakingTechnique, int weight){
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public Double getCalories(){
        return caloriesPerGram(this.flourType, this.bakingTechnique, this.weight);
    }


    private Double caloriesPerGram(String flourType, String bakingTechnique, int weight){
        double result = 0d;
        double modifier = 0d;
        double bakingTechModifier = 0d;
        flourType = flourType.toLowerCase();
        bakingTechnique = bakingTechnique.toLowerCase();

        if(flourType.equals("white")){
            modifier = 1.5;
        }else if (flourType.equals("wholegrain")){
            modifier = 1.0;
        }

        if(bakingTechnique.equals("crispy")){
            bakingTechModifier = 0.9;
        }else if (bakingTechnique.equals("chewy")){
            bakingTechModifier = 1.1;
        }else if (bakingTechnique.equals("homemade")){
            bakingTechModifier = 1.0;
        }

        result = (2 * weight) * modifier * bakingTechModifier;

        return result;
    }


}
