import java.util.Scanner;     //Allow for user inpits to be registered
import java.util.Random;      //Allow for random number generation

public class Assignment1 {
  public static void main(String[] args) {

    System.out.println();

    System.out.println("PPPPPPPP   KKK     KKK");
    System.out.println("PPP    PPP KKK    KKK ");
    System.out.println("PPP    PPP KKK   KKK  ");
    System.out.println("PPPPPPPP   KKKKKK     ");
    System.out.println("PPP        KKK   KKK  ");
    System.out.println("PPP        KKK    KKK ");
    System.out.println("PPP        KKK     KKK");

    System.out.println();     //Separate initials from Fahrenheit request

    System.out.println("Please enter a number in Fahrenheit: ");

    float temp;
    Scanner scan = new Scanner(System.in);
    temp = scan.nextFloat();      //Take user input as a float

    float celcius = (5*(temp-32))/9;      //Convert Fahrenheit to Celcius

    System.out.println();     //Separate Fahrenheit number from 5-character string request

    String fiveCharacters;
    System.out.println("Please enter a 5-character string: ");
    fiveCharacters = scan.next();     //Store the user-entered string

    System.out.println();     //Separate string entering from random number generation

    String trimmed;
    trimmed = fiveCharacters.substring(1, 4);      //Remove letters 1 and 5 of 5-character string

    char first, second, third;
    first = trimmed.charAt(0);
    second = trimmed.charAt(1);
    third = trimmed.charAt(2);      //Assign the remaining characters to variables first, second, and third accordingly

    String modified;
    modified = "" + third + second + first;     //Reverse order of the three remaining characters

    Random generator = new Random();
    int number;
    number = generator.nextInt(16353) + 32;     //Generate randomly from 0 to 16352 (inclusive), then add 32 (inclusive 32 to 16384)

    System.out.println("Generating random number. Continuing...");

    System.out.println("");     //Separate random number generation from final string

    String results;
    results = celcius + modified + number;
    System.out.println("Your new string is " + results);      //Display concatenated results of Celcius value, modified string, and random number

    System.out.println();

    scan.close();

  }
}
