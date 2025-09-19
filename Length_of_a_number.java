//W.A.P to calculate the length of any no. input by user  

import java.util.Scanner;
public class Length_of_a_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handling negative numbers
        num = Math.abs(num);

        // Convert to string and get length
        int length = String.valueOf(num).length();

        System.out.println("The length of the number is: " + length);

        sc.close();
    }
}
