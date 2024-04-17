package main;
import algs.Logic;
import utils.GameEngine;
import java.utils.Scanner;

public class Main {
     Static Scanner scanner;

    public static void main(String[] args) {
         GameEngine.init();
        scanner = new Scanner(System.in)
        while (!Logic.correct){
            GameEngine.promptuser();
        }

        GameEngine.printCorrectColors()
        Scanner.close();
    }
}



