/**
 * Created by my pc on 27.2.2017 г..
 */
public class Chicken {
    String name;
    int age;
    public Chicken(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {

        if(name==null||name.replaceAll(" ","").length()==0){

            throw new IllegalArgumentException("Name cannot be empty.");

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age<0||age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    private String calculateProductPerDay(){
        if(this.age<6){
            return "2";
        }else if(age>12){
            return "0.75";
        }else{
            return "1";
        }
    }
    public String productPerDay(){
        return this.calculateProductPerDay();
    }
}
