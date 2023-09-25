//Write a program using for loop to Create a result generator ask user number of
// marks to enter and calculate accordingly.

import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        float user_input, marks = 0,total_marks=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of Subject :");
        user_input = scan.nextInt();

        for (int i = 1; i<=user_input; i++){
            System.out.println("Enter marks obtained :");
            marks = scan.nextInt();
            total_marks += marks;
        }


        float percentage = (total_marks / (user_input *100) ) * 100;
        System.out.println(percentage+"%");

        if(percentage > 90){
            System.out.println("A+");
        }
        else if (percentage > 85) {
            System.out.println("A");
        }
        else if (percentage > 70) {
            System.out.println("B+");
        }
        else if (percentage > 55) {
            System.out.println("B");
        }
        else if (percentage > 40) {
            System.out.println("C+");
        }

    }
}
