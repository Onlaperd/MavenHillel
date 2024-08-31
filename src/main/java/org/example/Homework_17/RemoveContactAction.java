package Homework_17;

import java.util.Scanner;

public class RemoveContactAction implements MenuAction{

    private ImMemoryContacts contacts;
    private Scanner scanner;

    public RemoveContactAction(ImMemoryContacts contacts, Scanner scanner){
        this.scanner = scanner;
        this.contacts = contacts;
    }

    public String getName(){return "Видалити контакт";}

    public void execute(){

        System.out.println("Введіть порядковий номер контакту");
        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= contacts.length()){
            System.out.println("неіснуючий контакт");
        }else {
            contacts.remove(index);
        }
    }

    public boolean closeAfter(){return false;}

}
