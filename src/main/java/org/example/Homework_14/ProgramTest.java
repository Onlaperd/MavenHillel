package Homework_14;

public class ProgramTest {
    public static void main(String[] args) {
        PersonsList personsList = new PersonsList();

        Person randomPerson = new Person(1991, "Pavlo");


        //тестуємо метод printArray();
        personsList.printArray();

        //тестуємо метод add()
        for (int i = 0; i < 6; i++) {
            personsList.add(randomPerson);
        }
        personsList.printArray();

        //тестуємо метод remove()
        personsList.remove(2);
        personsList.remove(3);
        personsList.printArray();

        //тестуємо метод setPerson()
        personsList.setPerson(3, new Person(2007, "Dmytro"));

        //тестуємо метод getPerson()
        System.out.println(personsList.getPerson(3));

    }
}
