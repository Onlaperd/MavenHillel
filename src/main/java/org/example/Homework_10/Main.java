package Homework_10;

public class Main {

    public static void main(String[] args) {

        Car mustang = new Car("White", 4, "Ford", 1000);
        Car puma = new Car("White", 4, "Ford", 1000);
        Car lamborghini = new Car("Red", 4, "Lamborghini", 3000);

        carComparison(mustang, puma, "Mustang", "Puma");
        carComparison(lamborghini, mustang, "Lamborghini", "Mustang");
        carComparison(lamborghini, puma, "Lamborghini", "Puma");

    }

    static void carComparison(Car car1, Car car2, String car1Name, String car2Name){
        if(car1.hashCode() == car2.hashCode()){
            if(car1.equals(car2)) {
                System.out.println(car1Name + " по основних характиристиках ідентчний до " + car2Name);
            } else {
                System.out.println(car1Name + " по основних характиристиках не ідентчний до " + car2Name);
            }

        } else if(car1.hashCode() != car2.hashCode()){
            System.out.println(car1Name + " по основних характиристиках не ідентчний до " + car2Name);
        }
    }

}