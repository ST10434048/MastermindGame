package main;

import algs.Bubble;
import utils.RandomArray;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int min = 0;
        int max = 10;

        RandomArray randomArrayObjectInstance = new RandomArray(size, min, max);

        int[] randomarray = randomArrayObjectInstance.Generate();
        System.out.println("Random Array: \n");
        System.out.println("\n");
        randomArrayObjectInstance.print();
        int[] sortedArray = Bubble.sort(randomarray);

        System.out.println("\n");
        System.out.println("Sorted Array: \n");
        System.out.println("\n");
        System.out.print("[ ");
        for(int i=0; i< sortedArray.length -1; i++){
            System.out.print(sortedArray[i] + ", ");
        }
        System.out.print(sortedArray[sortedArray.length-1] + " ]");

    }
}



