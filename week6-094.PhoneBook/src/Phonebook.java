
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slinger
 */
public class Phonebook {

    private ArrayList<Person> phonebook = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        phonebook.add(person);
    }

    public void printAll() {
        for (Person person : phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : phonebook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }

}
