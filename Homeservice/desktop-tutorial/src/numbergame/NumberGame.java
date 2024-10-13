package numbergame;

import java.util.Scanner;
import java.util.Random;
public class NumberGame {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Number Game");
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println(name+", i am thinking  of a number 1 to 100");
        int myNo= randomNo(1,101);
        for(int i =0;i<6;i++){
            Scanner scan= new Scanner(System.in);
            System.out.println("Any Guess");
            int guess =scan.nextInt();
             if(guess==myNo){
                 System.out.println("Correct guess");
                 break;
                 
             }else if(guess<myNo){
                 System.out.println("your guess is low");
                 
             }else if(guess>myNo){
                 System.out.println("your guess is high");
                 
             }if(i>=5){
                 System.out.println("nope this number is "+myNo);
             }
        }
        
    }
    public static int randomNo(int low,int high){
       Random random= new Random();
        return random.ints(low,high).findFirst().getAsInt();    }
}
