package EncapsulationLab;

/**
 * Created by r3v3nan7 on 23.02.17.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person(String firstName, String lastName, Integer age, Double salary){
          setFirstName(firstName);
          setLastName(lastName);
          setAge(age);
          setSalary(salary);
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.salary = salary;
    }

    public String getFirstName() {

        return this.firstName;
    }

    private void setFirstName(String fname){
        if(fname.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = fname;
    }


    private String getLastName(){
        return this.lastName;
    }

    private void setLastName(String lname){
        if(lname.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lname;
    }

    public Integer getAge() {

        return this.age;
    }

    private void setAge(Integer age){
        if(age < 1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }


    private void setSalary(Double salary){
        if(salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public Double getSalary(){
        return this.salary;
    }


    public void increaseSalary(Integer bonus){
        if(this.age > 30){
            this.salary += this.salary * bonus / 100;
        }else {
            this.salary += this.salary * bonus / 200;
        }
    }


    public String toString() {
//        return this.getFirstName() + " " + this.getLastName() + " is a " + this.getAge() + " years old.";
//          return this.getFirstName() + " " + this.getLastName() + " get " + this.getSalary() + " leva";

        return this.getFirstName() + " " + this.getLastName() + " get " + this.getSalary() + " leva";

    }
}
