package utils;
import java.util.Random;

public class GameEngine {
    static char[] allPossinleColors = new char[] ('R','G', 'B', 'W', 'P','M','Y', 'T');
    static char[] correctColors;
    static Random random;

    public static void init(){
        correctColors = new char[4];
        random = new Random();
        for(int i = 0; i<4; i++){
           int rvalue =  random.nextInt(8);
            correctColors[i] = allPossinleColors[rvalue];
        }
    }
    public static void printCorrectColors(){
        for(int i = 0; i<correctColors.length; i++)
        System.out.print(correctColors[i] + ", ")
    }

    public static promptuser(){
        Main.scanner.useDelimter(",")
        String input = Main.scanner.nextLine();
        parseInput(input)
       
    }
    private static parseInput(String input){
        input = input.replaceAll("\\s+", "")
        String[] stringArray = input.split(",");
        char[] processedChars = new char[4];
        for(int i = 0; i<stringArray.length; i++){
            stringArray[i].charAt(0);
            
        }

    }
}
