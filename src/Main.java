import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("It's a great day today");
//        Scanner scanIn = new Scanner(System.in);
//        System.out.println(("What is your name?"));
//        String name = scanIn.nextLine();
//        System.out.println("Hi: " +name + " how are you doing?");
//
//  ======Exercise 2=====

//        System.out.println("What is a random number?");
//        Scanner scanIn = new Scanner(System.in);
//        int number = scanIn.nextInt();
//        System.out.println("Give me another number");
//        int number2 = scanIn.nextInt();
//        System.out.println(number + number2 + " :here's their total");
//
//   =====Exercise 3 =====
//
      System.out.println("What is your account balance");
      Scanner scanIn = new Scanner(System.in);
      int balance = scanIn.nextInt();
      System.out.println("I've granted you $1.50 more!");
      double newBalance = balance + 1.50;
      System.out.println(newBalance);


    }
}
