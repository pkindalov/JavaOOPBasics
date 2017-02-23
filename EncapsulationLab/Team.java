package EncapsulationLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by r3v3nan7 on 23.02.17.
 */
public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name){
        setName(name);
        firstTeam = new ArrayList<>();
        reserveTeam = new ArrayList<>();
//        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }


    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeam.add(person);
        }else {
            reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(reserveTeam);
    }


}
