package lab.p02_StaticId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String input;
        while (!"End".equals(input = reader.readLine())) {
            String[] tokens = input.split("\\s+");
            String cmdType = tokens[0];
            switch (cmdType) {
                case "Create":
                    execCreate();
                    break;
                case "Deposit":
                    execDeposit(tokens);
                    break;
                case "SetInterest":
                    setInterest(tokens);
                    break;
                case "GetInterest":
                    getInterest(tokens);
                    break;
            }
        }
    }

    private static void getInterest(String[] tokens) {
        int id = Integer.parseInt(tokens[1]);
        int years = Integer.parseInt(tokens[2]);

        if (accounts.containsKey(id)) {
            System.out.println(String.format("%.2f", accounts.get(id).getInterest(years)));
        } else {
            System.out.println("Account does not exist");
        }

    }

    private static void setInterest(String[] tokens) {
        double id = Double.parseDouble(tokens[1]);
        BankAccount.setInterest(id);
    }

    private static void execDeposit(String[] tokens) {
        int id = Integer.parseInt(tokens[1]);
        int money = Integer.parseInt(tokens[2]);

        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(money);
            System.out.println("Deposited " + money + " to ID" + accounts.get(id).getId());
        } else {
            System.out.println("Account does not exist");
        }


    }

    private static void execCreate() {
        BankAccount bankAccount = new BankAccount();

        if (accounts.containsKey(bankAccount.getId())) {
            System.out.println("Account already exists");
        } else {
            accounts.put(bankAccount.getId(), bankAccount);
            System.out.println("Account ID" + bankAccount.getId() + " created");
        }
    }
}
