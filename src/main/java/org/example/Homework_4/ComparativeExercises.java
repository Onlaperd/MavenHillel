package Homework_4;

public class ComparativeExercises {
    public static void main(String[] args) {
        Comparation(3, 2);
        Comparation(1, 3);
        Comparation(5, 0);

        Comparation2(3, 2);
        Comparation2(1,6);
        Comparation2(5,0);

    }

    public static void Comparation(int a, int b){
        if (a <= 1 && b >= 3){
            System.out.println(a + b);
        } else{
            System.out.println(a - b);
        }
    }

    public static void Comparation2(int a, int b){
        if ((a > 2 && a < 11) || (b >= 6 && a < 14)){
            System.out.println("вірно");
        }else {
            System.out.println("не вірно");
        }
    }

}
