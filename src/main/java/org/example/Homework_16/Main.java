package Homework_16;

public class Main {
    public static void main(String[] args) {
        iPhones iPhone = new iPhones();
        Androids android = new Androids();

        iPhone.internet();
        iPhone.sms();
        iPhone.call();

        android.internet();
        android.sms();
        android.call();


    }

}