package Homework_17;

import java.util.ArrayList;

public class ImMemoryContacts {


    private ArrayList<Contact> contacts = new ArrayList<>();


    public ArrayList<Contact> getAll(){
        return contacts;
    }

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(int index){
        contacts.remove(index);
    }
    public int length(){
        return contacts.size();
    }

    public Contact getContact(int index){
        return contacts.get(index);
    }

}
