package Homework_3;

public class Main {
    public static void main(String[] args) {
        int liArmyStrength = calculateArmyStrength(13, 24,
                46, 860 * 3);
        int MinArmyStrength = calculateArmyStrength(9, 35,
                12, (int)(860 * 3 * 1.5));

        System.out.println("li army strength: " + liArmyStrength);
        System.out.println("Min army strength: " + MinArmyStrength);

}
static int calculateArmyStrength
            (int warriorsStrength, int archersStrength, int ridersStrength, int armyAmount){
        return (warriorsStrength + archersStrength + ridersStrength) * armyAmount;
    }
}