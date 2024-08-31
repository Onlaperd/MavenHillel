package Homework_11;

public class Main {

    static String[] musicPopBands = new String[]{
            "Aviator", "ABBA", "Bee Gees"
    };

    static String[] musicRockBands = new String[]{
            "the Beatles", "Metallica", "Rolling Stone"
    };

    static String[] musicClassicBands = new String[]{
            "Bavarian Orchestra", "Berlin Philharmonic", "Boston Orchestra"
    };

    public static void main(String[] args) {

        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();

        System.out.println("====");
        for (String element : musicPopBands){
            popMusic.playMusic(element);
        }
        System.out.println("====");
        for (String element : musicRockBands){
            rockMusic.playMusic(element);
        }
        System.out.println("====");
        for (String element : musicClassicBands){
            classicMusic.playMusic(element);
        }

    }

}
