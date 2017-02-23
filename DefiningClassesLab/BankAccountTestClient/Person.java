package DefiningClassesLab.BankAccountTestClient;
import java.util.List;

/**
 * Created by r3v3nan7 on 21.02.17.
 */
public class Person {
    
    private String name;
    private Integer age;
    private List<BankAccount> accounts;


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public Person(String name, Integer age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }
    
    
    public double getBalance(){
        return this.accounts.stream().mapToDouble(x -> x.getBalance()).sum();
    }
    
}
