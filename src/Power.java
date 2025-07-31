import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        x = input.nextInt();
        System.out.println("enter power to the number " + x);
        y = input.nextInt();


        System.out.println("results to " + x + "times " + y + " is : " + Math.pow(x, y));


    }
}
