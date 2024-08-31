package Homework_16;

public class iPhones implements Smartphones, IOS {
    public void call(){
        System.out.println("дзвонимо з айфону");
    }
    public void sms(){
        System.out.println("пишемо смс з айфону");
    }

    public void internet(){
        System.out.println("виходимо в інтернет з айфону");
    }
}
