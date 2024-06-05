import java.util.*;

public class Task1 {
    public static void main(String args[]){

        System.out.println("Welcome to the Number Game!");
        System.out.println("The system  will generate a random number between 1 and 100");
        System.out.println("Your goal is to guess the number.");
        System.out.print("Enter the number of rounds you want to play (1-5): ");

        Scanner sc = new Scanner(System.in);
        int rounds=sc.nextInt();
        Random rand = new Random();

        for(int i=0;i<rounds;i++){
            System.out.println("\nRound " + (i+1) + " begins....");
            int attempt=0;
            int guess;
            int random= rand.nextInt(100)+1;
            System.out.println("Difficulty level: Easy (no limit on attempts)");

            do{
                System.out.print("Enter your guess number: ");
                guess= sc.nextInt();
                attempt++;
                if(guess<random){
                    System.out.println("\nYour guess is too low.Try again");
                }
                else if(guess>random){
                    System.out.println("Your guess is too high.Try again");
                }
                else{
                    System.out.println("Congratulations!! You guessed the number in "+attempt+" attempts");
                }
            }
            while(guess!=random);


            attempt=0;
            System.out.println("Difficulty level: Hard(5 attempts)");
            do{
                attempt++;
                System.out.print("Enter your guess: ");
                guess=sc.nextInt();

                if(guess<random){
                    System.out.println("Your guess is too low. Try again");
                }
                else if(guess>random){
                    System.out.println("Your guess is too high. Try again");
                }
                else{
                    System.out.println("Congratulations!! You guessed the number in "+attempt+" attempts");
                    if(attempt==1){
                        System.out.println("Your score: "+100);
                    }
                    else if(attempt==2){
                        System.out.println("Your score: "+80);
                    }
                    else if(attempt==3){
                        System.out.println("Your score: "+60);
                    }
                    else if(attempt==4){
                        System.out.println("Your score: "+40);
                    }
                    else{
                        System.out.println("Your score: "+20);
                    }
                    break;
                }
            }
            while(attempt<5);

            if(attempt==5 && guess!=random){
                System.out.println("Sorry,you didn't guess the number in 5 attempts.The number was "+random + ".");
                System.out.println("Your score: "+0);
            }


        }
        System.out.println("Thank you for playing the Number Game!");
        sc.close();
    }
 }
 
