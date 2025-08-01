import java.util.Scanner;
//-----------------------------------------find power in java
public class Power {
    public static void main(String[] args) {
        int x;
        int y;
        // collect x and y from user
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        x = input.nextInt();
        System.out.println("enter power to the number " + x);
        y = input.nextInt();
        int result = (int)Math.pow(x,y); //java math method
        System.out.println(x + " power " + y + " = " + result);

    }
}
