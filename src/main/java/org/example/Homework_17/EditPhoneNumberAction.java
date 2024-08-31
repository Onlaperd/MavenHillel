package Homework_17;

import java.util.Scanner;

public class EditPhoneNumberAction implements MenuAction{

    private Scanner scanner;
    private ImMemoryContacts contacts;

    public EditPhoneNumberAction(ImMemoryContacts contacts, Scanner scanner){
        this.scanner = scanner;
        this.contacts = contacts;
    }

    public String getName(){return "редагувати номер телефону контакту";}

    public void execute(){
        System.out.println("Введіть порядковий номер контакту");
        int index = scanner.nextInt() - 1;
        System.out.println("Введіть новий номер телефону");
        scanner.nextLine();
        String newPhoneNumber = scanner.nextLine();
        contacts.getContact(index).setPhoneNumber(newPhoneNumber);
    }

    public boolean closeAfter(){return false;}
}
