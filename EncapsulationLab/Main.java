package EncapsulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by r3v3nan7 on 23.02.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Team team = new Team("Minior");
        int n = Integer.parseInt(reader.readLine());
        List<Person> persons = new ArrayList<>();



        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                persons.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        for (Person person : persons) {
            team.addPlayer(person);
        }


        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");

//        Collections.sort(persons, (firstPerson, secondPerson) -> {
//            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
//
//            if (sComp != 0) {
//                return sComp;
//            } else {
//                return firstPerson.getAge().compareTo(secondPerson.getAge());
//            }
//
//
//        });

//        int bonus = Integer.parseInt(reader.readLine());
//
//        for (Person person : persons) {
//           person.increaseSalary(bonus);
//            System.out.println(person.toString());
//        }


    }
}
