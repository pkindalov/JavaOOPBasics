package DefiningClassesLab.BankAccountTestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by r3v3nan7 on 21.02.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BankAccount acc = new BankAccount();

        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        String command = reader.readLine();
        while (!"End".equals(command)){
            String[] commArgs = command.split("\\s+");
            String cmdType = commArgs[0];

            switch (cmdType){
                case "Create":
                    execCreate(commArgs, accounts);
                    break;
                case "Deposit":
                    execDeposit(commArgs, accounts);
                    break;
                case "Withdraw":
                    execWithdraw(commArgs, accounts);
                    break;
                case "Print":
                    execPrint(commArgs, accounts);
                    break;
            }



            command = reader.readLine();
        }

//        acc.setId(1);
//        acc.deposit(15.0);
//        acc.withdraw(5.0);
//
//        System.out.printf(
//          "Account %s, balance %.2f", acc, acc.getBalance()
//        );
    }

    private static void execPrint(String[] commArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commArgs[1]);

        if(accounts.containsKey(id)){
            System.out.println(accounts.get(id));
        }else {
            System.out.println("Accout does not exists");
        }
    }

    private static void execWithdraw(String[] commArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commArgs[1]);
        Double money = Double.parseDouble(commArgs[2]);

        if(accounts.containsKey(id)){
            BankAccount account = accounts.get(id);
            account.withdraw(money);
        }else {
            System.out.println("Account does not exist");
        }

    }

    private static void execDeposit(String[] commArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commArgs[1]);
        Double money = Double.parseDouble(commArgs[2]);

        if(accounts.containsKey(id)){
            BankAccount account = accounts.get(id);
            account.deposit(money);
        }else {
            System.out.println("Account does not exists");
        }
    }

    private static void execCreate(String[] commArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commArgs[1]);

        if(accounts.containsKey(id)){
            System.out.println("Account already exists.");
        }else {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }

    }


}
