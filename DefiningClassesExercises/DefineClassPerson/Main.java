package DefiningClassesExercises.DefineClassPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by r3v3nan7 on 22.02.17.
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //this is for first exercise
//        Class person = Person.class;
//
//        Field[] fields = person.getDeclaredFields();
//        System.out.println(fields.length);



        //this si for second exercise
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(isr);
//
//        Class personClass = Person.class;
//        Constructor emptyCtor = personClass.getDeclaredConstructor();
//        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
//        Constructor nameAgeCtor = personClass.getDeclaredConstructor(String.class, int.class);
//        String name = reader.readLine();
//
//
//        int age = Integer.parseInt(reader.readLine());
//
//        Person basePerson = (Person) emptyCtor.newInstance();
//        Person personWithAge = (Person) ageCtor.newInstance(age);
//        Person personFull = (Person) nameAgeCtor.newInstance(name, age);
//
//        System.out.printf("%s %s%n", basePerson.getName(), basePerson.getAge());
//
//        System.out.printf("%s %s%n", personWithAge.getName(), personWithAge.getAge());
//
//        System.out.printf("%s %s%n", personFull.getName(), personFull.getAge());



        //Third exercise
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> personList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person();
            person.setName(name);
            person.setAge(age);
            personList.add(person);
        }


        personList.stream()
                  .filter(p -> p.getAge() > 30)
                  .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                  .forEach(p -> System.out.printf("%s - %d", p.getName(), p.getAge()));


    }


}