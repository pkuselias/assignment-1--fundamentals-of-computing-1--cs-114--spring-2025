import java.util.Scanner;     //Allows for user inpits to be registered

public class Assignment1 {
  public static void main(String[] args) {

    System.out.println("PPPPPPPP   KKK     KKK");
    System.out.println("PPP    PPP KKK    KKK ");
    System.out.println("PPP    PPP KKK   KKK  ");
    System.out.println("PPPPPPPP   KKKKKK     ");
    System.out.println("PPP        KKK   KKK  ");
    System.out.println("PPP        KKK    KKK ");
    System.out.println("PPP        KKK     KKK");

    System.out.println("");     //Separating initials from Fahrenheit request

    System.out.println("Please enter a number in Fahrenheit: ");

    float temp;
    Scanner scan = new Scanner(System.in);
    temp = scan.nextFloat();      //Taking user input as a float

    float celcius = (5*(temp-32))/9;      //Converts Fahrenheit to Celcius

    String fiveCharacters;
    System.out.println("Please enter a 5-character string: ");
    fiveCharacters = scan.next();

  }
}
