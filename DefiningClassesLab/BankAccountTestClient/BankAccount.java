package DefiningClassesLab.BankAccountTestClient;

/**
 * Created by r3v3nan7 on 21.02.17.
 */
public class BankAccount {

    private int id;
    private double balance;

    public void setId(int id){
        this.id = id;
    }


    public Double getBalance(){
        return this.balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        this.balance -= amount;
    }


    public String toString(){
        return "ID" + this.id;
    }


}
