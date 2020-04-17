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
                //Stores the words entered
                arr[i] = keyboard.nextLine();
            }
            //Prints out the words in original order
            System.out.println("Original Order: " + Arrays.toString(arr));
        } while (arr[9].isEmpty()); //once the last word has been enter, it exits loop

        //check if the last space in the array is not empty
           String temp; //Create a temp value
           for (int i = arr.length - 1; i > 0; i--){
               for(int g = 0; g < i; g++){
                   if ((arr[g].compareTo(arr[g+1]) > 0)){ //Compares the values and switches them
                       temp = arr[g];
                       arr[g] = arr[g+1];
                       arr[g+1] = temp;
                   }
               }
           }
           //Print Ascending Alphabet order
           System.out.println("Ascending Alphabet Order: " + Arrays.toString(arr));
           for (int i = arr.length - 1; i > 0; i--){
            for(int g = 0; g < i; g++){
                if ((arr[g].compareTo(arr[g+1]) < 0)){ //Compares the values and switches them
                    temp = arr[g];
                    arr[g] = arr[g+1];
                    arr[g+1] = temp;
                }
            }
        }
           //Print Descending Alphabet Order
        System.out.println("Descending Alphabet Order: " + Arrays.toString(arr));
    }
}