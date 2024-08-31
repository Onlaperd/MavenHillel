package Homework_14;

import java.util.Arrays;

public class PersonsList {

    private Person[] people = new Person[5];

    public void add(Person person){

        if (person == null) {
            System.err.println("Person is not initialized");
            return;
        }

        int counter = people.length;

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null){
                counter--;
            }
        }
        if (counter == 0){
            Person[] newArray = new Person[people.length + 5];
            for (int i = 0; i < people.length; i++) {
                newArray[i] = people[i];
            }
            people = newArray;
            people[people.length - 5] = person;
        } else{
            people[people.length - counter] = person;
        }

    }


    public void remove(int index){
        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds exception");
            return;
        }
        Person[] newArray = new Person[people.length - 1];
        for (int i = 0; i < newArray.length; i++){
            if (i < index){
                newArray[i] = people[i];
            } else {
                newArray[i] = people[i + 1];
            }
        }
        people = newArray;
    }

    public void setPerson(int index, Person person){
        if (checkArrayBounds(index) || person == null){
            System.err.println("Array index out of bounds exception or person wasn't initialized");
            return;
        }
        people[index] = person;
    }

    public Person getPerson(int index){
        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds exception");
            return null;
        }
        return people[index];
    }

    private boolean checkArrayBounds(int index){
        return index >= people.length || index < 0;
    }

    public void printArray(){
        System.out.println(Arrays.toString(people));
    }


}