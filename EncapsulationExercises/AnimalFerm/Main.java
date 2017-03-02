import java.util.Scanner;

/**
 * Created by my pc on 27.2.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String name = cs.nextLine();
        int age = -1;
        try{
            age = Integer.parseInt(cs.nextLine());
        }catch (NumberFormatException ne){
            age = -1;
        }

        try{
            Chicken  chicken = new Chicken(name,age);
            System.out.printf("Chicken %s (age %d) can produce %s eggs per day.",chicken.getName(),chicken.getAge(),chicken.productPerDay());
        }catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }

    }
}
