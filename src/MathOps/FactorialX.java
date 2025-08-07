package MathOps;

import java.util.Arrays;
import java.util.Scanner;

public class FactorialX {
    public static void main(String[] args) {
        int x;
        int factorialResult = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get its facrorial : ");
        x = input.nextInt();
        int[] numbers = new int[x];

        for (int i = 0; i < x; i++) {
            numbers[i] = i + 1;
        }
        if (x != 0 && x != 1){
                for (int j = 0; j < x; j++) {
                    factorialResult = factorialResult * numbers[j];
                }
            }
            System.out.println(Arrays.toString(numbers));
            System.out.println("factrial result of the number " + x + " is : " + factorialResult);

    }
}
