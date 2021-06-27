import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    double doubleRandomNumber = Math.random() * 100;
    int randomNumber = (int) doubleRandomNumber;

    Scanner guessNum = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int myNum = guessNum.nextInt();


    System.out.println(doubleRandomNumber);
    System.out.println(randomNumber);


     do {

       if (myNum < randomNumber) {
         System.out.println("Number is less than random number");

       } else {
         System.out.println("Number is more than random number");
         System.out.println("Try again: ");
         guessNum.nextInt();
       }

     } while (myNum != randomNumber); //scrap do and while and write the full code
  }
}

