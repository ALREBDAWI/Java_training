package MathOps;

import java.util.Arrays;
import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its sum with all lower natural numbers");
        int n = input.nextInt();  //collect the number N from user
        int[] numbers = new int[n+1];
        int sumResult = 0;

        for(int i = 0; i <= n ; i++){
            numbers[i] = i ;
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j < numbers.length; j++) {
            sumResult = sumResult + numbers[j];
        }
        System.out.println("sum result of numbers between " + n + " and 1 is : " + sumResult);
    }

}
