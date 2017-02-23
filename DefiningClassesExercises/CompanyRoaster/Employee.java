package DefiningClassesExercises.CompanyRoaster;

/**
 * Created by r3v3nan7 on 22.02.17.
 */
public class Employee {

    //declaring fields
    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    //declare getters and setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return this.salary;
    }


    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return this.position;
    }

    public void setDepartment(String department){
        this.department += department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }



    //declaring constructor
    public Employee(String name, Double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }





}
