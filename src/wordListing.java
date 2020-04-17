/**
 * Ask user to enter 10 words
 * save each word in an array of 10
 * sort words in ascending order
 * print out words in original order
 * print out words in ascending order
 * print out words in descending order
 * */




import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class wordListing {
    public static void main(String[] args){
        String arr[] = new String[10];
        int size = arr.length;
        Scanner keyboard = new Scanner(System.in); //Scanner class
        do { //Prompt user to enter 10 words
            for (int i = 0; i < size; i++){
                System.out.print("Enter 10 words: ");
                arr[i] = keyboard.nextLine();
            }
//        String temp[] = new String[10];
        } while (arr[9].isEmpty()); //once the last word has been enter, it exits loop

        if (!arr[9].isEmpty()){ //check if the last space in the array is not empty
            //Print out the array as it was entered
            System.out.println("Original Order: " + Arrays.toString(arr));
            //Sort the array in ascending order
            Arrays.sort(arr);
            //Print out array in ascending order
            System.out.println("Alphabetical Order: " + Arrays.toString(arr));
            //Sort the array in descending order
            Arrays.sort(arr, reverseOrder());
            //Print out array in descending order
            System.out.println("Reversed Alphabetical Order: " + Arrays.toString(arr));
        }
    }
}
