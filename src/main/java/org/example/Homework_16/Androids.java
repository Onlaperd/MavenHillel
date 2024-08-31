package Homework_16;

public class Androids implements Smartphones, LinuxOS{

    public void call(){
        System.out.println("дзвонимо з андроїду");
    }
    public void sms(){
        System.out.println("пишемо смс з андроїду");
    }

    public void internet(){
        System.out.println("виходимо в інтернет з андроїду");
    }
}
