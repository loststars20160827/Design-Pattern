package src.Item;


import src.Base.Person;
import src.Base.Plant;

public class House extends Building {

    public String getDescription(){
        return getName();
    }

    public House(String name) {
        this.setName(name);
    }

    public boolean addLodger(Person person){
        check(person);
        return addLodger(person);
    }

    public boolean removeLodger(Person person){
        return removeLodger(person);
    }
}
