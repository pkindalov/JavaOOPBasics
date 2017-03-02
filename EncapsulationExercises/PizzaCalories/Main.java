package EncapsulationExercises.ClassData.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by r3v3nan7 on 25.02.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        while (!"END".equals(command)){

            String[] inputInformation = command.split(" ");

            try{
                if(inputInformation.length == 4){
                    //Dough
                    String flourType = inputInformation[1];
                    String bakingTechnique = inputInformation[2];
                    int weight = Integer.parseInt(inputInformation[3]);

                    Dough dough = new Dough(flourType,bakingTechnique, weight);
                    System.out.printf("%.2f\n", dough.getCalories());

                }else if(inputInformation.length == 3){
                    //Topping
                    String toppingType = inputInformation[1];
                    int weight = Integer.parseInt(inputInformation[2]);

                    Topping topping = new Topping(toppingType, weight);
                    System.out.printf("%.2f\n", topping.getCaloriesPerGram());
                }



            }catch (Exception e){
                System.out.println(e.getMessage());
            }


            command = reader.readLine();
        }

    }

}
