package DefiningClassesExercises.CompanyRoaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by r3v3nan7 on 22.02.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Employee> employeeList = new LinkedList<>();
        int n = Integer.parseInt(reader.readLine());


        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            Double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = new Employee(name, salary, position, department);

            if(input.length == 5){
                String elementToCheck = input[4];
                if(elementToCheck.contains("@")){
                    employee.setEmail(input[4]);
                }else {
                    employee.setAge(Integer.parseInt(input[4]));
                }
            }

            if(input.length == 6){
                employee.setEmail(input[4]);
                employee.setAge(Integer.parseInt(input[5]));
            }


//            if(i > 3 ){
//                String email = input[4];
//                if(email.contains("@")) {
//                    employee.setEmail(email);
//                }else{
//                    employee.setAge(Integer.parseInt(email));
//                }
//            }
//
//            if(i >= 4){
//                String age = input[5];
//                if(age.contains("@")) {
//                    employee.setEmail(age);
//                }else{
//                    employee.setAge(Integer.parseInt(age));
//                }
//            }

            employeeList.add(employee);

        }



        Map<String, Double> mostSalary = new HashMap<>();

        for (Employee employee : employeeList) {
            if(!mostSalary.containsKey(employee.getDepartment())){
                mostSalary.put(employee.getDepartment(), employee.getSalary());
            }else {
                Double value = employee.getSalary();
                mostSalary.put(employee.getDepartment(), mostSalary.get(employee.getDepartment()) +value);
            }
        }


        String key = "";
        Double maxValue = Double.MIN_VALUE;

        for (String s : mostSalary.keySet()) {
            if(mostSalary.get(s) > maxValue){
                maxValue = mostSalary.get(s);
                key = s;
            }
        }


        System.out.println("Highest Average Salary: " + key);



        String finalKey = key;
        employeeList.stream()
                    .filter(x -> x.getDepartment().equals(finalKey))
                    .sorted((a,b) -> b.getSalary().compareTo(a.getSalary()))
                    .forEach(p -> {
                        System.out.printf("%s %.2f %s %d%n", p.getName(), p.getSalary(), p.getEmail(), p.getAge());
                    });

//        mostSalary.entrySet()
//                  .stream()
//                  .max((a, b) -> Double.compare(a.getValue(), b.getValue()))
//                  .get();
////                  .forEach(d -> {
////                      System.out.println("Highest Average Salary:");
////                      System.out.println(d.getKey());
////                  } );

        String debug = "";





    }



}
